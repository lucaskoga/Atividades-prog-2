/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
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
public class DevolverVeiculoController {
    @FXML
    private ChoiceBox<HistoricoRetiradas> selectRetirada = new ChoiceBox<>();
    
    @FXML
    private DatePicker selectData;
    
    @FXML
    private void carregarOperacoes(){
        selectRetirada.getItems().clear();
        Dao<HistoricoRetiradas> dao = new Dao(HistoricoRetiradas.class);
        List<HistoricoRetiradas> todos = dao.listarTodos();
        int n = todos.size();
        for(int i = 0 ; i < n ; i++){
            if(todos.get(i).getDataDevolucao()==null){
                selectRetirada.getItems().add(todos.get(i));
            }
        }
    }
    
    @FXML
    private void confirmar() throws IOException {
        HistoricoRetiradas h = new HistoricoRetiradas();
        h = selectRetirada.getValue();
        h.setDataDevolucao(selectData.getValue());
        Dao<HistoricoRetiradas> dao = new Dao(HistoricoRetiradas.class);
        List<HistoricoRetiradas> todos = dao.listarTodos();
        int n = todos.size();
        for(int i = 0 ; i < n ; i++){
            if(todos.get(i).getId() == h.getId()){
                dao.alterar(h);
                break;
            }
        }
        //Veiculo
        Dao<Veiculo> daoVeiculo = new Dao(Veiculo.class);
        List<Veiculo> todosVeiculo = daoVeiculo.listarTodos();
        
        int n2 = todosVeiculo.size();
        Veiculo v = h.getVeiculo();
        for(int i = 0 ; i < n2 ; i++){
            if(todosVeiculo.get(i).getId() == v.getId()){
                Veiculo v2 = todosVeiculo.get(i);
                v2.setAlocado(false);
                daoVeiculo.alterar(v2);
                break;
            }
        }
        
        //Motorista
        Dao<Motorista> daoMotorista = new Dao(Motorista.class);
        List<Motorista> todosMotorista = daoMotorista.listarTodos();
        
        int n3 = todosMotorista.size();
        Motorista m = h.getMotorista();
        for(int i = 0 ; i < n3 ; i++){
            if(todosMotorista.get(i).getId() == m.getId()){
                Motorista m2 = todosMotorista.get(i);
                m2.setTrabalhando(false);
                daoMotorista.alterar(m2);
                break;
            }
        }
        Alert alerta = new Alert(Alert.AlertType.INFORMATION);
        alerta.setHeaderText("");
        alerta.setContentText("Veículo Devolvido!");
        alerta.showAndWait();
        App.setRoot("menuPrincipal");
    }
    
    @FXML
    private void initialize(){
        this.carregarOperacoes();
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
