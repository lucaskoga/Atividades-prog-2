public class Cilindro extends Circulo {
    private double altura;
    private double are;

    public Cilindro(){
        super();
        altura = 0;
        are = 0;
    }
    public Cilindro(double altura, double raio){
        super(raio);
        this.altura = altura;
    }

    public double calcularArea(){
         are = (2 * (Math.PI * getRaio() * 2) + (2 * (Math.PI * getRaio() * altura)));
         return are;
    }

    public double getAltura() {
        return altura;
    }

    public void setAltura(double altura) {
        this.altura = altura;
    }

    public double getAre() {
        return are;
    }

    public void setAre(double are) {
        this.are = are;
    }
}
