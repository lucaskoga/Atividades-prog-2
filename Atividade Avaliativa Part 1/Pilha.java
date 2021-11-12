import java.util.ArrayList;


public class Pilha <E> {
    ArrayList<E> elementos;

    public Pilha(){
        elementos = new ArrayList();
    }

    public void empilhar(E e){
        elementos.add(e);
    }

    public E desempilhar() throws ExcecaoPilhaVazia {
        if (elementos.isEmpty()){
            throw new ExcecaoPilhaVazia();
        }
        E aux = elementos.get(elementos.size() - 1);
        elementos.remove(elementos.size() - 1);
        return aux;
    }

}
