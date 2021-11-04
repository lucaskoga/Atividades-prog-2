public class Principal {
    public static void main(String[] args) throws ExcecaoPilhaVazia {
        Pilha pil = new Pilha(5);

        for (int i=0; i<7; i++){
            No n = new No("pil:"+i, i);
            pil.empilha(n);
        }
        System.out.println("Imprime pilha...");
        pil.imprime();

        pil.desempilha();
        pil.desempilha();

        pil.imprime();
        pil.desempilha();
        pil.desempilha();
        pil.imprime();
        pil.desempilha();
        pil.desempilha();

    }
}
