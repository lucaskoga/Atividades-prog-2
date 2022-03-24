/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/UnitTests/JUnit5TestClass.java to edit this template
 */
package util;

import java.util.List;
import modelo.Motorista;
import modelo.Veiculo;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

/**
 *
 * @author User
 */
public class DaoTest {
    
    public DaoTest() {
    }
    
    @BeforeAll
    public static void setUpClass() {
    }
    
    @AfterAll
    public static void tearDownClass() {
    }
    
    @BeforeEach
    public void setUp() {
    }
    
    @AfterEach
    public void tearDown() {
    }

//    @Test
//    public void testInserir() {
//       Veiculo v = new Veiculo("Ford","Camaro","ABC1234");
//       Dao<Veiculo> dao = new Dao(Veiculo.class);
//       dao.inserir(v);
//    }
    
//    @Test
//    public void testLista(){
//        Dao<Veiculo> dao = new Dao(Veiculo.class);
//        List<Veiculo> lista = dao.listarTodos();
//        
//        for(Veiculo v : lista){
//            System.out.println(v);
//        }
//    }
    
//    @Test
//    public void testMotorista(){
//        Endereco endereco = new Endereco();
//        endereco.setCep("242144-43");
//        endereco.setLocalidade("Bandeirantes");
//        endereco.setLogradouro("Rua Torta");
//        endereco.setUf("Pr");
//        
//        Motorista m = new Motorista("Mula",endereco,"10.488303-2","Pr");
//        Dao<Motorista> dao = new Dao(Motorista.class);
//        dao.inserir(m);
//    }
    
//    @Test
//    public void testListaMotorista(){
//        Dao<Motorista> dao = new Dao(Motorista.class);
//        List<Motorista> lista = dao.listarTodos();
//        
//        for(Motorista m : lista){
//            System.out.println(m.getNome());
//            System.out.println(m.getId());
//            System.out.println(m.getEndereco());
//        }
//    }
    
}
