public class Bebida {
    private String marca;
    private String nome;



    public Bebida(){
        marca = "";
        nome = "";
    }
    public Bebida(String marca,String nome){
        this.marca = marca;
        this.nome = nome;
    }

    public String getMarca() {
        return marca;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }
    public String toString(){
        return "A Marca é:" + this.marca+ "O seu:" + this.nome;
    }
}
