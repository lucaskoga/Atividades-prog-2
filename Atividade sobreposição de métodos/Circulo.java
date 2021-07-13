public class Circulo {
    private double raio;
    private double area;

    public Circulo(){
        raio = 0;
        area = 0;
    }
    public Circulo(double raio){
        this.raio = raio;
    }

    public double calcularArea(){
        area = Math.PI * (raio * 2);
        return area;
    }

    public double getRaio() {
        return raio;
    }

    public void setRaio(double raio) {
        this.raio = raio;
    }

    public double getArea() {
        return area;
    }

    public void setArea(double area) {
        this.area = area;
    }
}
