package Aula_14;

import java.util.Collections;
import java.util.ArrayList;
import java.util.List;

public class Main {
    @SuppressWarnings("unchecked")
    public static void main(String[] args) {
        // Lista para todos os tipos
        @SuppressWarnings("rawtypes")
        List list = new ArrayList();
        list.add(1);
        list.add("Aula 14");
        list.add(2, "Posição 2");

        // Outra forma de pegar os dados da list, precisa fazer o cast
        @SuppressWarnings("unused")
        String dado = (String) list.get(1);

        // ----------------------------------- List generica --------------------------------------

        // Recomendado listas para tipos primitivos
        List<Integer> list2 = new ArrayList<>();

        list2.add(2); list2.add(1); list2.add(3);

        // Não é necessario fazer o casting
        @SuppressWarnings("unused")
        int num = list2.get(0);
        
        // -------------------------------------- Exibindo -----------------------------------------

        // Forma de exibir os dados da lista

        for (int i = 0; i < list.size(); i++) {
            System.out.println(list.get(i));
        }

        for (Object obj : list) {
            System.out.println(obj);
        }

        // -------------------------------------- Ordenando ---------------------------------------

        Collections.sort(list2);

        for (Object obj : list2) {
            System.out.println(obj);
        }

        // ---------------------------------- Ordenando Classes ------------------------------------
    
        List<Aluno> alunos = new ArrayList<>();
        alunos.add(new Aluno("Jorge", 7));
        alunos.add(new Aluno("Lucas", 9));
        alunos.add(new Aluno("Pedro", 5));

        System.out.println("Não ordenado!");

        for (Aluno obj : alunos)
            System.out.println(obj.getNome() + " - " + obj.getNota());
        

        Collections.sort(alunos);

        System.out.println("Ordenado!");
        
        for (Aluno obj : alunos)
            System.out.println(obj.getNome() + " - " + obj.getNota());

    }
}
