package com;

import java.io.IOException;
import java.util.List;
import javafx.fxml.FXML;
import javafx.scene.control.Alert;
import javafx.scene.control.ChoiceBox;
import javafx.scene.control.DatePicker;
import modelo.HistoricoRetiradas;
import modelo.Motorista;
import modelo.Operador;
import modelo.Veiculo;
import util.Dao;

/**
 *
 * @author iedu1
 */
public class RetirarVeiculoController {
    
    @FXML
    private ChoiceBox<Veiculo> selectVeiculo = new ChoiceBox<>();
    @FXML
    private ChoiceBox<Motorista> selectMotorista = new ChoiceBox<>();
    @FXML
    private DatePicker selectData;
    
    @FXML
    private void carregarVeiculos(){
        selectVeiculo.getItems().clear();
        Dao<Veiculo> dao = new Dao(Veiculo.class);
        List<Veiculo> todos = dao.listarTodos();
        int n = todos.size();
        for(int i = 0 ; i < n ; i++){
            if(todos.get(i).isAlocado()==false){
                selectVeiculo.getItems().add(todos.get(i));
            }
        }
    }
    
    @FXML
    private void carregarMotoristas(){
        selectMotorista.getItems().clear();
        Dao<Motorista> dao = new Dao(Motorista.class);
        List<Motorista> todos = dao.listarTodos();
        int n = todos.size();
        for(int i = 0 ; i < n ; i++){
            if(todos.get(i).isTrabalhando()==false){
                selectMotorista.getItems().add(todos.get(i));
            }
        }
    }
    
    @FXML
    private void confirmar() throws IOException {
        
        Dao<HistoricoRetiradas> daoHistorico = new Dao(HistoricoRetiradas.class);
        Dao<Operador> daoOperador = new Dao(Operador.class);
        List<Operador> todosOperador = daoOperador.listarTodos();
        
        HistoricoRetiradas historico = new HistoricoRetiradas();
        
        //Motorista
        Dao<Motorista> daoMotorista = new Dao(Motorista.class);
        List<Motorista> todosMotorista = daoMotorista.listarTodos(); 
        Motorista auxMotorista = selectMotorista.getValue();
        
        Motorista m = selectMotorista.getValue();
        m.setTrabalhando(true);
        historico.setMotorista(m);
        int n2 = todosMotorista.size();
        for(int i = 0 ; i < n2 ; i++){
            if(todosMotorista.get(i).getCnh().equals(auxMotorista.getCnh())){
                Motorista auxMotorista2 = todosMotorista.get(i);
                auxMotorista2.setTrabalhando(true);
                daoMotorista.alterar(auxMotorista2);
                break;
            }
        }
        
        //Veiculo
        Dao<Veiculo> dao = new Dao(Veiculo.class);
        List<Veiculo> todos = dao.listarTodos();
        
        Veiculo v = selectVeiculo.getValue();
        v.setAlocado(true);
        historico.setVeiculo(v);
        Veiculo auxVeiculo = selectVeiculo.getValue();
        int n = todos.size();
        for (int i = 0 ; i < n ; i++){
            if(todos.get(i).getPlaca().equals(auxVeiculo.getPlaca())){
                Veiculo auxVeiculo2 = todos.get(i);
                auxVeiculo2.setAlocado(true);
                dao.alterar(auxVeiculo2);
                break;
            }
        }
        
        //Data
        historico.setDataRetirada(selectData.getValue());
        
        
        //Operador
        historico.setOperador(new Operador());
        
        int n3 = todosOperador.size();
        for(int i = 0 ; i < n3 ; i++){
            if(todosOperador.get(i).isOperando() == true){
                Operador auxOperador = todosOperador.get(i);
                historico.setOperador(auxOperador);
                break;
            }
        }
        
        daoHistorico.inserir(historico);
        Alert alerta = new Alert(Alert.AlertType.INFORMATION);
        alerta.setHeaderText("");
        alerta.setContentText("Veìculo Retirado!");
        alerta.showAndWait();
        App.setRoot("menuPrincipal");
        /*Dao<Veiculo> dao = new Dao(Veiculo.class);
        List<Veiculo> todos = dao.listarTodos();
        
        Dao<Motorista> daoMotorista = new Dao(Motorista.class);
        List<Motorista> todosMotorista = daoMotorista.listarTodos();
        
        
        Dao<HistoricoRetiradas> dao2 = new Dao(HistoricoRetiradas.class);
        
        
        Veiculo auxVeiculo = selectVeiculo.getValue();
        System.out.println("AuxVeiculo de fora " + auxVeiculo+"\n");
        Motorista auxMotorista = selectMotorista.getValue();
        System.out.println("AuxMotorista de fora " + auxMotorista+"\n");
        LocalDate auxData = selectData.getValue();
        //Operador auxOperador = new Operador();
        
        Veiculo guardaVeiculo = new Veiculo();
        Motorista guardaMotorista = new Motorista();
        Operador guardaOperador = new Operador();
        int n = todos.size();
        for (int i = 0 ; i < n ; i++){
            if(todos.get(i).getPlaca().equals(auxVeiculo.getPlaca())){
                Veiculo auxVeiculo2 = todos.get(i);
                System.out.println("AuxVeiculo de dentro " + auxVeiculo2+"\n");
                auxVeiculo2.setAlocado(true);
                dao.alterar(auxVeiculo2);
                guardaVeiculo = auxVeiculo2;
                break;
            }
        }
        int n2 = todosMotorista.size();
        for(int i = 0 ; i < n2 ; i++){
            if(todosMotorista.get(i).getCnh().equals(auxMotorista.getCnh())){
                Motorista auxMotorista2 = todosMotorista.get(i);
                System.out.println("AuxMotorista de dentro " + auxMotorista2+"\n");
                auxMotorista2.setTrabalhando(true);
                daoMotorista.alterar(auxMotorista2);
                guardaMotorista = auxMotorista2;
                break;
            }
        }
        
        int n3 = todosOperador.size();
        for(int i = 0 ; i < n3 ; i++){
            if(todosOperador.get(i).isOperando() == true){
                Operador auxOperador = todosOperador.get(i);
                guardaOperador = auxOperador;
                break;
            }
        }
        
        HistoricoRetiradas historico = new HistoricoRetiradas(guardaVeiculo, guardaMotorista, guardaOperador, auxData);
        dao2.inserir(historico);
        System.out.println("Motorista do historico: " + historico.getMotorista());
        System.out.println("Veiculo do historico: "+ historico.getVeiculo());
        App.setRoot("menuPrincipal");*/
        
    }
    
    @FXML
    private void initialize(){
        this.carregarMotoristas();
        this.carregarVeiculos();
    }
    
    @FXML
    private void cancelar() throws IOException {
        App.setRoot("menuPrincipal");
    }
    
    @FXML
    private void mudarParaCadastroMotorista() throws IOException {
        App.setRoot("cadastrarMotorista");
    }
    
    @FXML
    private void mudarParaCadastroVeiculo() throws IOException {
        App.setRoot("cadastrarVeiculo");
    }
    
    @FXML
    private void mudarParaCadastroOperador() throws IOException {
        App.setRoot("cadastroOperador");
    }
    
    @FXML
    private void mudarParaConsultarOperacoes() throws IOException {
        App.setRoot("consultarOperacoes");
    }
    
    @FXML
    private void mudarParaDevolverVeiculo() throws IOException {
        App.setRoot("devolverVeiculo");
    }
    
    @FXML
    private void mudarParaLogin() throws IOException {
        Operador verifica = new Operador();
        Dao<Operador> daoVerifica = new Dao(Operador.class);
        List<Operador> lista = daoVerifica.listarTodos();
        int tam = lista.size();
        for(int i = 0 ; i < tam ; i++){
            if(lista.get(i).isOperando() == true){
                verifica = lista.get(i);
                verifica.setOperando(false);
                daoVerifica.alterar(verifica);
            }
        }
        App.setRoot("login");
    }
    
    @FXML
    private void mudarParaRetirarVeiculo() throws IOException {
        App.setRoot("retirarVeiculo");
    }
}
