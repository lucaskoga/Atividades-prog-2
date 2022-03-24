/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com;

import java.io.IOException;
import java.time.LocalDate;
import java.util.List;
import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.fxml.FXML;
import javafx.scene.control.TableColumn;
import javafx.scene.control.TableView;
import javafx.scene.control.cell.PropertyValueFactory;
import modelo.HistoricoRetiradas;
import modelo.Motorista;
import modelo.Operador;
import modelo.Veiculo;
import util.Dao;

/**
 *
 * @author iedu1
 */
public class ConsultarOperacoesController {
    @FXML
    private TableView<HistoricoRetiradas> tabela;
    @FXML
    private TableColumn<HistoricoRetiradas, Veiculo> veiculoCol;
    @FXML
    private TableColumn<HistoricoRetiradas, Motorista> motoristaCol;
    @FXML
    private TableColumn<HistoricoRetiradas, Operador> operadorCol;
    @FXML
    private TableColumn<HistoricoRetiradas, LocalDate> dataRetiradaCol;
    @FXML
    private TableColumn<HistoricoRetiradas, LocalDate> dataDevolucaoCol;
    
    Dao<HistoricoRetiradas> dao = new Dao(HistoricoRetiradas.class);
    List<HistoricoRetiradas> todos = dao.listarTodos(); 
    ObservableList<HistoricoRetiradas> obsLista = obsLista = FXCollections.observableArrayList(todos);
    
     @FXML
    private void initialize(){
        veiculoCol.setCellValueFactory(new PropertyValueFactory<>("veiculo"));
        motoristaCol.setCellValueFactory(new PropertyValueFactory<>("motorista"));
        operadorCol.setCellValueFactory(new PropertyValueFactory<>("operador"));
        dataRetiradaCol.setCellValueFactory(new PropertyValueFactory<>("dataRetirada"));
        dataDevolucaoCol.setCellValueFactory(new PropertyValueFactory<>("dataDevolucao"));

        this.carregarTabela();
    }
    
    @FXML
    private void carregarTabela() {
        tabela.setItems(obsLista);
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
