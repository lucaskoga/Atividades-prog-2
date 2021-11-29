package Pilha;

import javafx.scene.control.IndexRange;

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
        System.out.println("O seguinte elemento removido: "+aux);
        return aux;
    }
    public String toString(){
        return elementos.toString();
    }
    public void imprimirPilha(){
        for (E e :elementos){
            System.out.println("A pilha possui os seguintes elementos: "+ e);
        }
    }

    public ArrayList<E> getElementos() {
        return elementos;
    }

    public void setElementos(ArrayList<E> elementos) {
        this.elementos = elementos;
    }
}