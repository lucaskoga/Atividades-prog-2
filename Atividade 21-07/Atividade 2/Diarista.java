public class Diarista extends Funcionario {

    private double salarioDia;
    private int diasTrabalhados;

    public Diarista(){
        salarioDia = 0;
        diasTrabalhados = 0;
    }

    @Override
    public double getsaldo() {
        return 0;
    }

    public double calcularSalario(double salarioDia, int diasTrabalhados){
        salarioDia = salarioDia * diasTrabalhados;
        System.out.println(salarioDia);
        return salarioDia;

    }

    public double getSalarioDia() {
        return salarioDia;
    }

    public void setSalarioDia(double salarioDia) {
        this.salarioDia = salarioDia;
    }

    public int getDiasTrabalhados() {
        return diasTrabalhados;
    }

    public void setDiasTrabalhados(int diasTrabalhados) {
        this.diasTrabalhados = diasTrabalhados;
    }
}
