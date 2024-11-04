package Atividades.Atividade_18;

import java.util.HashSet;
import java.util.Set;

public class Main {
    public static void main(String[] args) {
        Pessoa pessoa = new Pessoa("Joaquim", 100);
        Pessoa pessoa2 = new Pessoa("Lucas", 200);
        Pessoa pessoa3 = null;
        
        Set<Pessoa> pessoas = new HashSet<Pessoa>();
        pessoas.add(pessoa);
        pessoas.add(pessoa2);
        pessoas.add(pessoa3);
        
        try {
            for (Pessoa p : pessoas) {
                System.out.println(p.getNome());
            }
        } catch (NullPointerException e) {
            System.out.println("Um erro ocorreu! " + e);
        }

        System.out.println("Fim do programa!");
    }
}