package Aula_06;

import java.util.Scanner;

public class Jogadores {
  int num_camisa, num_gols;
  String nome;

  Jogadores DarDados(){
    Scanner entrada = new Scanner(System.in);
    Jogadores jogador = new Jogadores();

    System.out.print("Nome: ");
    jogador.nome = entrada.next();

    System.out.print("Número da camisa: ");
    jogador.num_camisa = entrada.nextInt();

    System.out.print("Saldo de gols: ");
    jogador.num_gols = entrada.nextInt();

    entrada.close();

    return jogador;
  }

  void AtualizarDados(int quantidade){
    num_gols += quantidade;
  }
}