public class Principal {

    public static void main(String[] args) {
        Circulo circulo = new Circulo(4);
        System.out.println(circulo.calcularArea());
        Cilindro cilindro = new Cilindro(5,4);
        System.out.println(cilindro.calcularArea());
    }
}
