public class FolhaPagamento {

    public static void main(String[] args) {
        Funcionario listVert[] = new Funcionario[10];
        

        Diarista diarista = new Diarista();
        Gerente gerente = new Gerente();

        diarista.calcularSalario(60,10);
        gerente.calcularSalario(800);


    }
}
