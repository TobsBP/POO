package Atividades.Atividade_03;

import java.util.Scanner;

public class Atividade_03 {
  public static void main(String[] args) {
    System.out.println("Digite a nota da NPA: ");

    Scanner entrada = new Scanner(System.in);

    int nota = entrada.nextInt();

    if(nota >= 60)
      System.out.println("Aprovado!");
    else
      System.out.println("NP3!");
          int nota_NP3 = entrada.nextInt();
          
          if (nota_NP3 >= 50) {
            System.out.println("Aprovado!");            
          }else
            System.out.println("Reprovado!");

    entrada.close();
  }
}
