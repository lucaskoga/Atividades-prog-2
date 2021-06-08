import java.util.Scanner;

public class Cartao {
    int unidade;
    Scanner teclado = new Scanner(System.in);

    //Construtor
    Cartao(){
        unidade = 10;
    }
    //Comprar o Café
    int comprarCafe(){
        System.out.println("Você Possui um total de "+unidade+" Unidade para poder compar o café");
        System.out.println("Digite a quantidade de café que quer compar");
        int saida = teclado.nextInt();
        if(saida > unidade){
            System.out.println("Unidade insuficiente, Voce Possui apenas ");
        }else {
            unidade = unidade - saida;
        }
        return unidade;
    }
    //Comprar Recarga do cartão
    int ComprarSaldoDeCafe(){
        System.out.println("Para recarregar o se cartão Informe a a quantiade de unidade que quer compar");
       int entrada = teclado.nextInt();
        System.out.println("Agora você possui saldo de");
       unidade = unidade + entrada;
       return unidade;
    }
}
