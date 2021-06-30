import java.util.Scanner;

public class Principal {

    public static void main(String[] args) {
        Scanner leitor = new Scanner(System.in);
        int Vaganum = leitor.nextInt();
        Vaga vagavet[] = new Vaga[Vaganum];


        vagavet[1] = new Vaga();
        vagavet[1].adicionarCarro("abc1234",12);

        for (int i = 0; i < vagavet.length; i++) {
           String placa = vagavet[i].getPlaca();
            System.out.println(placa);

        }
    }
}
