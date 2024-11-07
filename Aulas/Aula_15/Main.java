package Aula_15;

import java.util.*;
public class Main {

    public static void main(String[] args) {
        // HashSet, alto desempenho para busca de dados
        Set<String> nomes = new HashSet<String>();

        // Adicionando
        nomes.add("Joaquim");
        nomes.add("Lucas");
        nomes.add("Maria");

        System.out.println("Nomes: ");
        
        for (String nome : nomes)
            System.out.println(nome);

        System.out.println("");
        
        // Removendo

        nomes.remove("Lucas");

        System.out.println("Nomes: ");

        for (String nome : nomes)
            System.out.println(nome);

        // Removendo de forma segura

        Iterator<String> it = nomes.iterator();

        while (it.hasNext()) {
            if (it.next() == "Joaquim") {
                it.remove();
            }
        }

        System.out.println("Nomes: ");

        for (String nome : nomes)
            System.out.println(nome);

        // LinkedHashSet, mantem a ordem de inserção a custo de desempenho
        Set<String> nomes2 = new LinkedHashSet<String>();

        nomes2.add("Alan");
        nomes2.add("Joaquim");
        nomes2.add("Lucas");
        
        System.out.println("Nomes linkedHashSet: ");

        for (String nome : nomes2)
            System.out.println(nome);

        // Map, chave e valor, os valores são sobrescritos caso a chave exista
        Map<String, Double> carros = new HashMap<String, Double>();

        System.out.println("Map: ");

        carros.put("Gol", 1.6);
        carros.put("Uno", 1.0);
        carros.put("Corsa", 1.2);

        Double preco = carros.get("Gol");

        System.out.println("Preço do Gol: " + preco);
    
        System.out.println("Outra forma de exibir: ");

        carros.forEach((chave, valor) -> {
            System.out.println("Carro: " + chave + " - Potência: " + valor);
        });
    
    }
}
