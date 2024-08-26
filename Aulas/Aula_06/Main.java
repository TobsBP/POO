package Aula_06;

import java.util.Scanner;

public class Main {
  public static void main(String[] args) {
    Jogadores jogador[] = new Jogadores[2];
    Scanner entrada = new Scanner(System.in);

    for (int i = 0; i < jogador.length; i++)
      jogador[i] = new Jogadores();

    System.out.print("Nome: ");
    jogador[0].nome = entrada.next();
    
    System.out.print("Número da camisa: ");
    jogador[0].num_camisa = entrada.nextInt();

    System.out.print("Saldo de gols: ");
    jogador[0].num_gols = entrada.nextInt();

    System.out.print("Nome: ");
    jogador[1].nome = entrada.next();
    
    System.out.print("Número da camisa: ");
    jogador[1].num_camisa = entrada.nextInt();

    System.out.print("Saldo de gols: ");
    jogador[1].num_gols = entrada.nextInt();
    
    entrada.close();

    for (int i = 0; i < jogador.length; i++) {
      System.out.println("Nome: " + jogador[i].nome);
      System.out.println("Núemro da camisa: " + jogador[i].num_camisa);
      System.out.println("Saldo de gols: " + jogador[i].num_gols);
    }
  }
}