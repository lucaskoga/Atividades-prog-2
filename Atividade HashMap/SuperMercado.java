import java.util.Collections;
import java.util.HashMap;
import java.util.Map;

public class SuperMercado {


    public static void main(String[] args) {
        //Criado nosso HashMap
        HashMap<String, Double> map = new HashMap();
        //insiro as variaveis
        map.put("Macarrao",5.00);
        map.put("Arroz",7.48);
        map.put("Feijao",8.10);
        map.put("Abobora",3.98);

        //Percorre o vetor e print o nome e o valor de cada objeto
        for (Map.Entry e: map.entrySet()){
            System.out.println(e.getKey() + " - " + e.getValue());
        }

        //Utilizando o metodo collections para pegar o maior valor do vetor
        Double i = Collections.max(map.values());
        //Printa o maior valor
        System.out.printf("O maior valor do mercado eh: " + String.valueOf(i));

        //Para Procurar o valor do
        String keyToSearch = "Macarrao";
        System.out.printf("\n");
        //Percorre o valor procurando pelo key 
        if ( map.containsKey( keyToSearch ) ) {
            System.out.println("Valor do preço eh: "+keyToSearch+
                    " = "+map.get(keyToSearch));
        }else{
            System.err.println("Chave não existe");
        }

    }
}
