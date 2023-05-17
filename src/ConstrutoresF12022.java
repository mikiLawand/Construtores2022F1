import java.util.Collection;
import java.util.Collections;
import java.util.HashMap;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Set;
import java.util.TreeMap;

public class ConstrutoresF12022 {
    public static void main(String[] args) {
        
        //inicializando o map 
        Map<String, Integer> Construtores22 = new HashMap<>(){{
           put("Red Bull Racing RBPT", 759);
           put("Ferrari", 554);
           put("Mercedes", 515);
           put("Alpine Renault", 173);
           put("MCLaren Mercedes", 159);
           put("Alfa Romeo Ferrari", 55);
           put("Aston Martin Aramco Mercedes", 55);
           put("Haas Ferrari", 37);
           put("AlphaTauri RBPT", 35);
           put("Willians Mercedes", 8);
        }};
        System.out.println(Construtores22);

        //substitui o valor de um objeto 
        Construtores22.put("Alpine Renault", 165);
        System.out.println(Construtores22);

        //procura por um objeto 
        System.out.println("Confira se o time Ferrari está no dicionário: " + Construtores22.containsKey("Ferrari"));
        
        //retorna o valor atraves de uma chave 
        System.out.println("Exiba a pontuação da Mercedes: " + Construtores22.get("Mercedes"));

        //exibe só as chaves 
        System.out.println("Exiba somente os times: ");
        Set<String> times = Construtores22.keySet();
        System.out.println(times);

        //exibe só os valores 
        System.out.println("Exiba somente as pontuações dos times: ");
        Collection<Integer> pontos = Construtores22.values();
        System.out.println(pontos);

        //retorna o maior valor de uma chave
        System.out.println("Exiba o time que possui a maior pontuação: ");
        Integer melhorPontuacao = Collections.max(Construtores22.values()); //exibe os valores 
        Set<Map.Entry<String, Integer>> entries = Construtores22.entrySet(); //retorna o set
        String melhorTime = "";

        for (Map.Entry< String, Integer> entry : entries) {
            if (entry.getValue().equals(melhorPontuacao)) { 
            // faz uma comparação entre os pontos,se o valor for igual ao da melhor pontuação
                melhorTime = entry.getKey(); //é retornado sua chave
                System.out.println("A melhor pontução foi de: " + melhorPontuacao + " E o melhor time foi: " + melhorTime);

            }
        }
        
        //checa qual a menor pontuação 
        System.out.println("Exiba o time com menor pontuação: ");
        Integer menorPontuacao = Collections.min(Construtores22.values());
        String piorTime = "";

        for (Map.Entry<String, Integer> entry: Construtores22.entrySet()) {
            if (entry.getValue().equals(menorPontuacao)) {
                piorTime = entry.getKey();
                System.out.println("O time de menor pontuação foi a: " + piorTime + " E o a menor pontuação foi a de: " + menorPontuacao);
            }
        }

        //exibe a soma dos valores 
        Iterator<Integer> iterator = Construtores22.values().iterator(); //inicia o metodo iterator
        Integer soma = 0; //inicia a soma em 0 
        while(iterator.hasNext()){ //enquanto existir um proximo objeto
            soma += iterator.next(); //ele vai somar seu valor ao dos anteriores 
        }
        System.out.println("Exiba o total das pontuações: " + soma);

        //exibe a media atraves do metodo size 
        System.out.println("Exiba a média da pontuação: " + (soma/Construtores22.size()));

        //remove um objeto atraves do iterator 
        System.out.println("Remova os times com pontuação igual a 159: ");
        Iterator<Integer> iterator2 = Construtores22.values().iterator();
        while(iterator2.hasNext()){
            if(iterator2.next().equals(159)) iterator2.remove();
        }
        System.out.println(Construtores22);

        System.out.println("Exiba todos os times por ordem de inserção: ");
        Map<String, Integer> Construtores221 = new LinkedHashMap<>() {{ //inicializa o linkedHashMap
        //que respeita a ordem de inserção
            put("Red Bull Racing RBPT", 759);
            put("Ferrari", 554);
            put("Mercedes", 515);
            put("Alpine Renault", 173);
            put("MCLaren Mercedes", 159); 
            put("Alfa Romeo Ferrari", 55);
            put("Aston Martin Aramco Mercedes", 55);
            put("Haas Ferrari", 37);
            put("AlphaTauri RBPT", 35);
            put("Willians Mercedes", 8);
        }};
        System.out.println(Construtores221);

        System.out.println("Exiba os times por ordem natural: ");
        Map<String, Integer> Construtores222 = new TreeMap<>(Construtores221);
        System.out.println(Construtores222.toString());

        //System.out.println("Apague toda a coleção: ");
        //Construtores22.clear();

        System.out.println("Confira se a coleção está vazia: " + Construtores22.isEmpty());




    }
}