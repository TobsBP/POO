package Atividades.Atividade_06;

import java.util.Scanner;

public class Main {
  public static void main(String[] args) {
    Scanner entrada = new Scanner(System.in);
    Zumbi zumbi_0 = new Zumbi();
    Zumbi zumbi_1 = new Zumbi();
    int op = 8;

    zumbi_0.nome = "Luca";
    zumbi_0.vida = 10;

    zumbi_1.nome = "Pablo";
    zumbi_1.vida = 7;

    zumbi_0.mostraVida();
    zumbi_1.mostraVida();

    while (op != 3) {
      System.out.println("0- Transferir vida do " + zumbi_0.nome);
      System.out.println("1- Transferir vida do " + zumbi_1.nome);
      System.out.println("2- Mostrar hp");
      System.out.println("3- Finalizar programa");
      System.out.print("Opção:");
      op = entrada.nextInt(); 
      int num;

      switch (op) {
        case 0:
          System.out.print("Quantidade de vida:");
          num = entrada.nextInt();
          if(zumbi_0.tranfereVida(zumbi_1, num))
            System.out.println("Transferencia realizada com sucesso!");
          else
            System.out.println("Não é possivel tranferir essa quantidade de vida...");
          break;
        case 1:
        System.out.print("Quantidade de vida:");
          num = entrada.nextInt();
          if(zumbi_1.tranfereVida(zumbi_0, num))
            System.out.println("Transferencia realizada com sucesso!");
          else
            System.out.println("Não é possivel tranferir essa quantidade de vida...");
          break;    
        case 2:
          System.out.println("O " + zumbi_0.nome + "tem " + zumbi_0.vida + " de vida!");
          System.out.println("O " + zumbi_1.nome + "tem " + zumbi_1.vida + " de vida!");
          break;
        default:
          System.out.println("Finalizando programa...");
          break;
      }
    }

    entrada.close();
    /* Manipulando instancias com referencias iguais
    zumbi_0 = zumbi_1;

    zumbi_1.vida = 5;

    System.out.println("Instancia com refenrencia igual: ");
    zumbi_0.mostraVida();
    zumbi_1.mostraVida();
    */
  }
}
