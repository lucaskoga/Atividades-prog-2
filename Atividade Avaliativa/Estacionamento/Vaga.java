import java.util.Scanner;

public class Vaga {
    private String placa;
    private double horaLocal;
    private double tempoEntrada;
    private double tempoSaida;
    private double valor;
    private boolean ocupado;

    Scanner leitor = new Scanner(System.in);

    //Construtor
     Vaga() {
        placa = "";
        horaLocal = 0;
        valor = 0;
        tempoEntrada = 0;
        tempoSaida = 0;
    }
    //Adicionar carro
    public void addVaga(String placa, double tempoEntrada){
        this.placa = placa;
        this.tempoEntrada = tempoEntrada;
        ocupado = true;
    }
    public String imprimirPlaca(){
       return placa;
    }
    public double imprimirHora(){
         return tempoEntrada;
    }

        //Remover o carro
    public double removerCarro(String placa,double tempoEntrada, double tempoSaida){
         horaLocal = (tempoSaida - tempoEntrada); // vai pegar o valor dado da entrada e vai subtrair com o valor da saida
        horaLocal = (horaLocal * 60); // vai multiplicar o resultado da horalocal transformandao em minutos
        for (int i = 0; i < 24; i++){ //For criado para caso o carro fique mais de 1 dia parado no Estacionamento
            if (horaLocal > 0){
                valor = valor + 5;
                horaLocal = horaLocal - 60;
            }
        }

        System.out.println("Carro da Placa: "+placa+" saiu pagando: "+valor);
        return valor;
    }
        //Criado todos os get e set
    public String getPlaca() {
        return placa;
    }

    public void setPlaca(String placa) {
        this.placa = placa;
    }

    public double getValor() {
        return valor;
    }

    public void setValor(double valor) {
        this.valor = valor;
    }

    public double getHoraLocal() {
        return horaLocal;
    }

    public void setHoraLocal(double horaLocal) {
        this.horaLocal = horaLocal;
    }

    public double getTempoEntrada() {
        return tempoEntrada;
    }

    public void setTempoEntrada(double tempoEntrada) {
        this.tempoEntrada = tempoEntrada;
    }

    public double getTempoSaida() {
        return tempoSaida;
    }

    public void setTempoSaida(double tempoSaida) {
        this.tempoSaida = tempoSaida;
    }
    public   String  toString () {
        return  "Placa do Carro: "+this.getPlaca()+ " Hora Da Entrada: " + this.getTempoEntrada();
    }
    boolean getocupado(){
         return ocupado;
    }
}
