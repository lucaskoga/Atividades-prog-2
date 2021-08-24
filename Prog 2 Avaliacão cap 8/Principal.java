import java.util.ArrayList;
import java.util.Collections;

public class Principal {
    
    public static void main(String[] args) {

        IProduto pro1= new ProdutoUnitario(421,"feijao",7.50,50);
        IProduto pro2 = new ProdutoUnitario(564,"Carne",29.90,70);
        IProduto pro3 = new ProdutoFacionado(5421,"Cebola",4.30,23.5);
        IProduto pro4= new ProdutoFacionado(5252,"Tomate",2.50,14.6);

        System.out.println(pro1.calcularValorEmEstoque());
        System.out.println(pro2.calcularValorEmEstoque());
        System.out.println(pro3.calcularValorEmEstoque());
        System.out.println(pro4.calcularValorEmEstoque());
        
        ArrayList<Produto> lista;
        lista = new ArrayList<>();

        lista.add((Produto) pro1);
        lista.add((Produto) pro2);
        lista.add((Produto) pro3);
        lista.add((Produto) pro4);

        Collections.sort(lista);

        for (Produto aux : lista){
            System.out.println(aux.toString());
        }

    }
}
