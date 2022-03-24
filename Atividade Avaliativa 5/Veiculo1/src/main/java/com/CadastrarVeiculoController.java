package com;

import java.io.IOException;
import java.util.List;
import javafx.fxml.FXML;
import javafx.scene.control.Alert;
import javafx.scene.control.TextField;
import modelo.Operador;
import modelo.Veiculo;
import util.Dao;

public class CadastrarVeiculoController {

    @FXML
    private TextField campoMarca;

    @FXML
    private TextField campoModelo;

    @FXML
    private TextField campoPlaca;

    @FXML
    void salvar() throws IOException {
           Veiculo veiculo = new Veiculo();
           veiculo.setMarca(campoMarca.getText());
           veiculo.setModelo(campoModelo.getText());
           veiculo.setPlaca(campoPlaca.getText());
           Dao<Veiculo> dao = new Dao(Veiculo.class);
           dao.inserir(veiculo);
           Alert alerta = new Alert(Alert.AlertType.INFORMATION);
           alerta.setHeaderText("");
           alerta.setContentText("Veiculo cadastrado");
           alerta.showAndWait();
           campoMarca.setText("");
           campoModelo.setText("");
           campoPlaca.setText("");
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
