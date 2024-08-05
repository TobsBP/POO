package Atividades;

import java.util.Scanner;

public class Atividade_02 {
  public static void main(String[] args) {
    Scanner entrada = new Scanner(System.in);

    System.out.println("Digite o valor dos lanches:");

    int lanche_1, lanche_2, lanche_3;

    lanche_1 = entrada.nextInt();
    lanche_2 = entrada.nextInt();
    lanche_3 = entrada.nextInt();

    entrada.close();

    int total = lanche_1 + lanche_2 + lanche_3;
    int media = total / 3;

    System.out.println("Total de lanches: " + total);
    System.out.println("Media: " + media);

  }
}
