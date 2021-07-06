package capitulo_7;

import java.util.Scanner;

public class Caminhao extends Veiculo{
    private Integer carga;
    Scanner leitor = new Scanner(System.in);

    public Caminhao(){
        setAno(0);
        setMarca("");
        setValor(0.0);
        this.carga = carga;
    }
    void calcularIPVA(Integer ano,double valor){
        System.out.println("Qual o ano que estamos");
        int entrada = leitor.nextInt();
        ano = entrada - ano;
        if (ano < 20){
            valor = valor * 4;
            System.out.println("valor do importo a pagar:" +valor);
        }else {
            System.out.println("Caminha Isento de imposto");
        }
    }

}
