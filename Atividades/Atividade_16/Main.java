package Atividades.Atividade_16;

import java.util.Collections;
import java.util.ArrayList;
import java.util.List;

public class Main {

    public static void main(String[] args) {
        Professor professor = new Professor("Luiz", 56);        
        Policial policial = new Policial("Nelson", 19);
        Jogador jogador = new Jogador("Messi", 33);

        List<Pessoa> pessoas = new ArrayList<>();

        pessoas.add(professor); pessoas.add(policial); pessoas.add(jogador);

        Collections.sort(pessoas);

        for (Pessoa pessoa : pessoas) {
            System.out.println(pessoa.getNome());
        }
    }
}