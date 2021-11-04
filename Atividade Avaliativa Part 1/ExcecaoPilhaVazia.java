public class ExcecaoPilhaVazia extends Exception{


    public ExcecaoPilhaVazia(){
        super("A pilha esta Vazia impossivel retirar algo dela ");

    }
    public ExcecaoPilhaVazia (String msg){
        super(msg);
    }
}
