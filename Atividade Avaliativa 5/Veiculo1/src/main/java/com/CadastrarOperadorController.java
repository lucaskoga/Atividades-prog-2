package com;

import java.io.IOException;
import java.util.List;
import javafx.fxml.FXML;
import javafx.scene.control.Alert;
import javafx.scene.control.TextField;
import modelo.Buscador;
import modelo.Endereco;
import modelo.Operador;
import util.Dao;

/**
 *
 * @author iedu1
 */
public class CadastrarOperadorController {
    @FXML
    private TextField campoBairro;

    @FXML
    private TextField campoComplemento;

    @FXML
    private TextField campoEntrada;

    @FXML
    private TextField campoEstado;

    @FXML
    private TextField campoLocalidade;

    @FXML
    private TextField campoLogin;

    @FXML
    private TextField campoLogradouro;

    @FXML
    private TextField campoNome;

    @FXML
    private TextField campoSenha;
    
    private Buscador buscador;
    private Endereco endereco; 
    
    public CadastrarOperadorController(){
        buscador = new Buscador();
    }
    
    @FXML
    private void buscar() {
        String cep = campoEntrada.getText();
        try {
            endereco = buscador.buscar(cep);
            campoLogradouro.setText(endereco.getLogradouro());
            campoLocalidade.setText(endereco.getLocalidade());
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
        Operador operador = new Operador(campoNome.getText(), endereco, campoLogin.getText(), campoSenha.getText() );
        Dao<Operador> dao = new Dao(Operador.class);
        dao.inserir(operador);
        Alert alerta = new Alert(Alert.AlertType.INFORMATION);
        alerta.setHeaderText("");
        alerta.setContentText("Operador cadastrado");
        alerta.showAndWait();
        campoNome.setText("");
        campoLogin.setText("");
        campoSenha.setText("");
        campoEntrada.setText("");
        campoLogradouro.setText("");
        campoComplemento.setText("");
        campoBairro.setText("");
        campoLocalidade.setText("");
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
