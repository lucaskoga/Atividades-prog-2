public class ProdutoFacionado extends Produto implements IProduto{


    private double quantidadeEstoque;
    
    //Criando o construtor com os parametro da super classe
    public ProdutoFacionado(int codigo, String nome, double preco, double quantidadeEstoque) {
        super(codigo, nome, preco);
        this.quantidadeEstoque = quantidadeEstoque;
    }

    //Metodo para adicionar ao estoque
    public double adicionarEstoque(double valorAdicionar){
        quantidadeEstoque = quantidadeEstoque + valorAdicionar;
        return quantidadeEstoque;
    }

    //Metodo para retirar o produto comprado do estoque
    public double vender(double quantidadeVendida){
        quantidadeEstoque = quantidadeEstoque - quantidadeVendida;
        return quantidadeVendida;
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
                " Valor Facionado: "+getPreco() +" -"+ " Quantidade de Produto em Estoque: "+quantidadeEstoque+
                " -"+" Valor total em Estoque: "+calcularValorEmEstoque()+" R$";
    }
    
    //Metodo get e set
    public double getQuantidadeEstoque() {
        return quantidadeEstoque;
    }

    public void setQuantidadeEstoque(double quantidadeEstoque) {
        this.quantidadeEstoque = quantidadeEstoque;
    }
}
