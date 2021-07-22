public abstract class Funcionario {

    private double salario;


    public Funcionario(){
        salario = 0;
    }

    public abstract double getsaldo();

    public double calcularSalario(double salario){
        salario = getSalario() + salario;
        return salario;
    }

    public double getSalario() {
        return salario;
    }

    public void setSalario(double salario) {
        this.salario = salario;
    }
}
