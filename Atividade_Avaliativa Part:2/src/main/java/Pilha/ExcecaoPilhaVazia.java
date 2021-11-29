package Pilha;

public class ExcecaoPilhaVazia extends Exception{


    public ExcecaoPilhaVazia(){
        super("A pilha não possui nem um elemento para ser retirado ");


    }
    public ExcecaoPilhaVazia (String msg){
        super(msg);
    }
}
