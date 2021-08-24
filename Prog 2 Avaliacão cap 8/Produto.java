public abstract class Produto implements Comparable{

    private int codigo;
    private String nome;
    private double preco;

    //Criando o Construtor
    public Produto(int codigo, String nome, double preco) {
        this.codigo = codigo;
        this.nome = nome;
        this.preco = preco;
    }

        // ordena pelo codigo
    @Override
    public int compareTo(Object o) {
       Produto outra = (Produto) o;
        if (this.codigo < outra.getCodigo()){
           return -1;
        }
        if (this.codigo == outra.getCodigo()){
          return 0;
     }
       return 1;
   }
   //Reescrevendo o metodo ToString
    public String toString(){
        return "Codigo: "+ codigo + " Nome do Produto: "+ nome;
    }
    //Todos os get e set
    public int getCodigo() {
        return codigo;
    }

    public void setCodigo(int codigo) {
        this.codigo = codigo;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public double getPreco() {
        return preco;
    }

    public void setPreco(double preco) {
        this.preco = preco;
    }
}
