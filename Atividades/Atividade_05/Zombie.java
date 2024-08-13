package Atividades.Atividade_05;

import java.util.Scanner;

public class Zombie {
  String nome;
  int força, vida;

  void input(){
    Scanner entrada = new Scanner(System.in);
    
    System.out.print("Digite o nome do zombie: ");
    nome = entrada.next();

    System.out.print("Digite a força do zombie: ");
    força = entrada.nextInt();
    
    System.out.print("Digite a vida do zombie: ");
    vida = entrada.nextInt();

    entrada.close();
  }

  void info(){
    System.out.println("O zombi tem o nome: " + nome);
    System.out.println("O zombi tem " + vida);
    System.out.println("O zombi tem " + força);
  }
}