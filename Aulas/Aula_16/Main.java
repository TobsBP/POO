package Aula_16;

import java.util.Scanner;

public class Main {
    @SuppressWarnings("null")
    public static void main(String[] args) {
        //Exeções
        Pessoa pessoa = null;

        // Stack trace é o rastro da pilha

        //Exemplo de try catch
        try {
            pessoa.nome = "Joaquim";
            System.out.println("Nome: " + pessoa.nome);
        } catch (NullPointerException e) {
            System.out.println("Erro: " + e);
        }

        //Exemplo com Scanner
        Scanner entrada = new Scanner(System.in);
        int idade;

        try {
            idade = entrada.nextInt();
            System.out.println("Idade: " + idade);
        } catch (Exception e) {
            System.out.println("Digite uma idade!" + e);
        }

        entrada.close();
    }
}