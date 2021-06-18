public class Retangolo {

    private int lado1;
    private int lado2;


    Retangolo(){
        this.lado1 = 0;
        this.lado2 = 0;
    }

    Retangolo(int lado1,int lado2){
        this.lado1 = 0;
        this.lado2 = 0;
    }
    void verificarIgualdade(int lado1, int lado2){
        if (lado1 == lado2){
            System.out.println("Verdadeiro");
        }else {
            System.out.println("Falso");
        }

    }
    public void setLado1(int lado1){
        this.lado1 = lado1;
    }
    public int getLado1(){
        return this.lado1;
    }
    public void setLado2(int lado2){
        this.lado2 = lado2;
    }
    public int getLado2(){
        return this.lado2;
    }


}
