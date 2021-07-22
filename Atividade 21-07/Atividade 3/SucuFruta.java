public class SucaFruta extends Bebida{

    private String fruta;

    public SucaFruta(){
        super();
        fruta = "";
    }
    public SucaFruta(String marca, String nome, String fruta){
        super(marca, nome);
        this.fruta =fruta;
    }

    public String getFruta() {
        return fruta;
    }

    public void setFruta(String fruta) {
        this.fruta = fruta;
    }
}
