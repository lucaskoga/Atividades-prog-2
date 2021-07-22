public class Refigerante extends Bebida{

    private String sabor;

    public Refigerante(){
        super();
        sabor = "";
    }
    public Refigerante(String marca, String nome, String sabor){
        super(marca,nome);
        this.sabor = sabor;
    }

    public String getSabo() {
        return sabor;
    }

    public void setSabo(String sabo) {
        this.sabor = sabo;
    }
}
