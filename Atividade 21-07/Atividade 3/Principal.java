public class Principal {

    public static void main(String[] args) {
        Bebida bebida = new Bebida("fsafa","fsafsa");
        BebidaAlcolica bebidaAlcolica = new BebidaAlcolica("Skol","Skol Beats",45.8);
        Refigerante refigerante = new Refigerante("Coca-cola","Coca","Coca");
        SucaFruta sucaFruta = new SucaFruta("Frutas","Abacaxi","Abacaxi");


        System.out.println(bebidaAlcolica.toString());
        System.out.println(refigerante.toString());
        System.out.println(sucaFruta.toString());
        
    }
}
