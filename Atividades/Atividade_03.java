package Atividades;

import java.util.Scanner;

public class Atividade_03 {
  public static void main(String[] args) {
    System.out.println("Digite a nota da NPA: ");

    Scanner entrada = new Scanner(System.in);

    int nota = entrada.nextInt();

    entrada.close();

    if(nota >= 50)
      System.out.println("Aprovado!");
    else
      System.out.println("Reprovado!");
  }
}
