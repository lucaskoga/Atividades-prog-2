public class ProdutoUnitario extends Produto implements IProduto{

    private int quantidadeEstoque;

    
    public ProdutoUnitario(int codigo, String nome, double preco, int quantidadeEstoque) {
        super(codigo, nome, preco);
        this.quantidadeEstoque = quantidadeEstoque;
    }

    public int adicionarEstoque(int valorAdicionado){
        quantidadeEstoque = quantidadeEstoque + valorAdicionado;
        return quantidadeEstoque;
    }

    public void vendido(int valorPago){
        quantidadeEstoque = quantidadeEstoque - valorPago;
    }
    @Override
    public double calcularValorEmEstoque() {
        double valorEmEstoque = 0;
        valorEmEstoque = quantidadeEstoque * getPreco();
        return valorEmEstoque;
    }

    public int getQuantidadeEstoque() {
        return quantidadeEstoque;
    }

    public void setQuantidadeEstoque(int quantidadeEstoque) {
        this.quantidadeEstoque = quantidadeEstoque;
    }
}
