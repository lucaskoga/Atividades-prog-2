public class Gerente extends Funcionario{


    private double salarioMes;

    public Gerente(){
        salarioMes = 0;
    }

    @Override
    public double getsaldo() {
        return 0;
    }

    public double calcularSalario(double salarioMes){
        salarioMes = salarioMes * 0.10;
        System.out.println(salarioMes);
        return salarioMes;
    }

    public double getSalarioMes() {
        return salarioMes;
    }

    public void setSalarioMes(double salarioMes) {
        this.salarioMes = salarioMes;
    }
}
