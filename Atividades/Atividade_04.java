package Atividades;

import java.util.Random;
import java.util.Scanner;

public class Atividade_04 {
  public static void main(String[] args) {
    Scanner entrada = new Scanner(System.in);
    Random rand = new Random();
    
    int x = rand.nextInt(10) + 1;
    int y = entrada.nextInt();
    
    while (x != y) {
      if (y < x) {
        System.out.println("O número é maior que o digitado!");
        y = entrada.nextInt();
      }else{
        System.out.println("O número é menor que o digitado!");
        y = entrada.nextInt();
      }
    }
    entrada.close();

    System.out.println("Você acertou!!"); 
  }
}
