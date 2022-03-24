package com;

import java.io.IOException;
import java.util.List;
import javafx.fxml.FXML;
import javafx.scene.control.Alert;
import javafx.scene.control.PasswordField;
import javafx.scene.control.TextField;
import modelo.Operador;
import util.Dao;

/**
 *
 * @author iedu1
 */
public class LoginController {
    @FXML
    private TextField campoLogin;
    
    @FXML
    private PasswordField campoSenha;
    
    
    @FXML
    private void entrar() throws IOException {
        Dao<Operador> dao = new Dao(Operador.class);
        Operador operador = new Operador();
        operador.setLogin(campoLogin.getText());
        operador.setSenha(campoSenha.getText());
        List<Operador> lista = dao.listarTodos();
        int n = lista.size();
        for(int i = 0 ; i < n ; i++){
            if(lista.get(i).getLogin().equalsIgnoreCase(operador.getLogin())){
                if(lista.get(i).getSenha().equals(operador.getSenha())){
                    operador = lista.get(i);
                    operador.setOperando(true);
                    dao.alterar(operador);
                    App.setRoot("menuPrincipal");
                    return;
                }else {
                    Alert aviso = new Alert(Alert.AlertType.ERROR);
                    aviso.setHeaderText("");
                    aviso.setContentText("Usuário ou senha inválido");
                    aviso.showAndWait();
                    return;
                }
            }
        }
    }
}
