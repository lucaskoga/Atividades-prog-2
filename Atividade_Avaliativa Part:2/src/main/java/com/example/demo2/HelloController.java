package com.example.demo2;

import Pilha.Pilha;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Alert;
import javafx.scene.control.TextArea;
import javafx.scene.control.TextField;

import java.util.ArrayList;


public class HelloController {

    @FXML
    private TextField campoEntrada;

    @FXML
    private TextArea campoPilha;

    @FXML
    private TextField campoSaida;

    private Pilha pilha;

    public HelloController(){
        pilha = new Pilha();
    }

    @FXML
    void campoEntrada() {
        String obj = campoEntrada.getText();
        pilha.empilhar(obj);
        pilha.imprimirPilha();
        campoPilha.appendText(pilha.toString()+"\n");

        campoEntrada.setText("");
    }


    @FXML
    void campoSaida()  {
       try {
           campoSaida.setText((String) pilha.desempilhar());
           campoPilha.setText(pilha.toString());
           if (pilha.getElementos().isEmpty()){
               campoSaida.setText("");
           }
           


       }
       catch (Exception e){
           Alert alert = new Alert(Alert.AlertType.ERROR);
           alert.setHeaderText("SEGUINTE ERRO FOI ENCONTRADO !!!!");
           alert.setContentText(e.getMessage());
           alert.showAndWait();
       }
    }

}
