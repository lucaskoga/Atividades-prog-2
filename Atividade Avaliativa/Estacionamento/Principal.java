import java.util.Scanner;

public class Principal {
    static Scanner leitor = new Scanner(System.in);
    static int Vaganum = leitor.nextInt();
    static Vaga vagaVet[] = new Vaga[Vaganum];

    public static void main(String[] args) {
        System.out.println("Total de vaga: " + Vaganum);

        Vaga vaga = new Vaga();

        for (int i = 0; i < Vaganum; i++) {
            vagaVet[i] = new Vaga();
        }


        vagaVet[1].addVaga("AAA-7777",14.5);
        vagaVet[2].addVaga("ABG-6784",7.4);

        for (int i = 0; i < vagaVet.length; i++) {
            System.out.println(vagaVet[i]);
        }
        System.out.println("");
        vaga.removerCarro("AAA-7777",14.5,17);


    }

}
