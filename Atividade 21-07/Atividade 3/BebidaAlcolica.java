public class BebidaAlcolica extends Bebida{

    private double teorAlcoolico;

    public BebidaAlcolica(){
        super();
        this.teorAlcoolico = 0.0;
    }
    public BebidaAlcolica(String marca, String nome, double teorAlcoolico){
        super(marca,nome);
        this.teorAlcoolico = teorAlcoolico;
    }

    public double getTeorAlcoolico() {
        return teorAlcoolico;
    }

    public void setTeorAlcoolico(double teorAlcoolico) {
        this.teorAlcoolico = teorAlcoolico;
    }
}
