public class ProdutoUnitario extends Produto implements IProduto{

    private int quantidadeEstoque;

    //Criando o construtor com os parametro da super classe
    public ProdutoUnitario(int codigo, String nome, double preco, int quantidadeEstoque) {
        super(codigo, nome, preco);
        this.quantidadeEstoque = quantidadeEstoque;
    }
    
    //Metodo para adicionar ao estoque
    public void adicionarEstoque(int valorAdicionado){
        quantidadeEstoque = quantidadeEstoque + valorAdicionado;
    }
    
    //Metodo para retirar o produto comprado do estoque
    public int vendido(int quantidadeVendida){
        quantidadeEstoque = quantidadeEstoque - quantidadeVendida;
        return quantidadeEstoque;
    }
    
    //Reescrevendo o metodo da interface
    @Override
    public double calcularValorEmEstoque() {
        double valorEmEstoque = 0;
        valorEmEstoque = quantidadeEstoque * getPreco();
        return valorEmEstoque;
    }
    
    //Reescrevendo o metodo ToString
    public String toString(){
        return "Codigo do Produto: "+ getCodigo() +" -"+ " Nome do Produto: "+ getNome() +" -"+
                " Valor Unitario: "+getPreco() +" -"+ " Quantidade de Produto em Estoque: "+quantidadeEstoque+
                " -"+" Valor total em Estoque: "+calcularValorEmEstoque()+" R$";
    }

    //Todos os get e set
    public int getQuantidadeEstoque() {
        return quantidadeEstoque;
    }

    public void setQuantidadeEstoque(int quantidadeEstoque) {
        this.quantidadeEstoque = quantidadeEstoque;
    }
}
