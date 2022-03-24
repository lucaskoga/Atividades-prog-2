package com;

import java.io.IOException;
import java.util.List;
import javafx.fxml.FXML;
import javafx.scene.control.Alert;
import javafx.scene.control.TextField;
import modelo.Buscador;
import modelo.Endereco;
import modelo.Motorista;
import modelo.Operador;
import util.Dao;


public class CadastrarMotoristaController {
    @FXML
    private TextField campoNome;
    
    @FXML
    private TextField campoCnh;
    
    @FXML
    private TextField campoSessao;
    
    @FXML
    private TextField campoCep;
    
    @FXML
    private TextField campoLogradouro;
    
    @FXML
    private TextField campoComplemento;
    
    @FXML
    private TextField campoBairro;
    
    @FXML
    private TextField campoCidade; 
    
    @FXML
    private TextField campoEstado; 
    
    private Buscador buscador;
    private Endereco endereco; 
    
    public CadastrarMotoristaController(){
        buscador = new Buscador();
    }
    
    
    @FXML
    private void buscar() {
        String cep = campoCep.getText();
        try {
            endereco = buscador.buscar(cep);
            campoLogradouro.setText(endereco.getLogradouro());
            campoCidade.setText(endereco.getLocalidade());
            campoEstado.setText(endereco.getUf());
        } catch (IOException ex) {
            Alert alerta = new Alert(Alert.AlertType.ERROR);
            alerta.setHeaderText("");
            alerta.setContentText(ex.getMessage());
            alerta.showAndWait(); 
        }
        catch(Exception e){
            Alert alerta = new Alert(Alert.AlertType.ERROR);
            alerta.setHeaderText("");
            alerta.setContentText(e.getMessage());
            alerta.showAndWait(); 
        }

    }
    
    @FXML
    void salvar() throws IOException {
        endereco.setLogradouro(campoLogradouro.getText());
        endereco.setComplemento(campoComplemento.getText());
        endereco.setBairro(campoBairro.getText());
        Motorista motorista = new Motorista(campoNome.getText(), endereco, campoCnh.getText(), campoSessao.getText() );
        Dao<Motorista> dao = new Dao(Motorista.class);
        dao.inserir(motorista);
        Alert alerta = new Alert(Alert.AlertType.INFORMATION);
        alerta.setHeaderText("");
        alerta.setContentText("Motorista cadastrado");
        alerta.showAndWait();
        campoNome.setText("");
        campoCnh.setText("");
        campoSessao.setText("");
        campoCep.setText("");
        campoLogradouro.setText("");
        campoComplemento.setText("");
        campoBairro.setText("");
        campoCidade.setText("");
        campoEstado.setText("");
        App.setRoot("menuPrincipal");
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
