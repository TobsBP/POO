package Atividades.Atividade_10;

import java.util.Random;
import java.util.Scanner;

public class Main {
  public static void main(String[] args) {
    boolean campo[][];
    campo = new boolean[2][2];

    Random rand = new Random();

    int x = rand.nextInt(2);
    int y = rand.nextInt(2);

    for (int i = 0; i < campo.length; i++) {
      for (int j = 0; j < campo[i].length; j++) {
        campo[i][j] = false;
      }
    }

    campo[x][y] = true;

    Scanner entrada = new Scanner(System.in);
    boolean cambum = false;
    int cont = 0;

    while (!cambum) {
      System.out.print("Digite x: ");
      int xUser = entrada.nextInt();

      System.out.print("Digite y: ");
      int yUser = entrada.nextInt();

      if (campo[xUser][yUser] == true) {
        System.out.println("Cabum!");
        cambum = true;
      } else {
        System.out.println("Boa");
        cont++;

        if (cont == 3) {
          System.out.println("Ganhou!!");
          break;
        }
      }
    }

    entrada.close();
  }
}