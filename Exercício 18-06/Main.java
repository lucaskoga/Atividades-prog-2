public class Main {

    public static void main(String[] args) {
        Retangolo r = new Retangolo();
        Retangolo r2 = new Retangolo(4,4);
        r.verificarIgualdade(2,2);
        r.setLado1(4);
        System.out.println("Lado1:"+r.getLado1());
        r.setLado2(4);
        System.out.println("Lado2:"+r.getLado2());

        r.verificarIgualdade(r.getLado1(),r.getLado2());
    }
}
