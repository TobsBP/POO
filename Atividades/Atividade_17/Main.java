package Atividades.Atividade_17;

import java.util.*;

public class Main {
    public static void main(String[] args) {
        Set<Integer> hashSet = new HashSet<>();
        List<Integer> lista = new ArrayList<>();
        Map<Integer, Integer> map = new HashMap<>();

        long start = System.currentTimeMillis();

        for (int i = 0; i < 100000; i++)
            hashSet.add(i);
        
        for (Object object : hashSet)
            System.out.println(object);

        long end = System.currentTimeMillis();
        
        long time_set = (end - start);

        start = System.currentTimeMillis();

        for (int i = 0; i < 100000; i++)
            lista.add(i);
        
        for (Object object : lista)
            System.out.println(object);
        
        end = System.currentTimeMillis();

        long time_list = (end - start);

        start = System.currentTimeMillis();

        for (int i = 0; i < 100000; i++)
            map.put(i, i);
        
        for (Object object : map.keySet())
            System.out.println(object);
        
        end = System.currentTimeMillis();

        long time_map = (end - start);

        System.out.println("Hashset: " + time_set);
        System.out.println("List: " + time_list);
        System.out.println("Map: " + time_map);
    }
}
