package Aula_04;

import java.util.Scanner;

public class Main {
  public static void main(String[] args) {
    Conta conta_0 = new Conta();
    Conta conta_1 = new Conta();
    Conta conta_2 = new Conta();
    int valor;

    conta_0.nomeDono = "Jorge";
    conta_0.saldo = 1000;
    conta_0.numero = 143;

    conta_1.nomeDono = "Lucas";
    conta_1.saldo = 1570;
    conta_0.numero = 145;

    conta_2.nomeDono = "Pedro";
    conta_2.saldo = 2706;
    conta_0.numero = 149;

    Scanner entrada = new Scanner(System.in);
    int op = 2000;

    while (op != 9) {
      System.out.println("Escolha uma opção:");
      System.out.println("0- Transferir dinheiro da conta 0 para conta 1");
      System.out.println("1- Transferir dinheiro da conta 0 para conta 2");
      System.out.println("2- Transferir dinheiro da conta 1 para conta 2");
      System.out.println("3- Transferir dinheiro da conta 1 para conta 0");
      System.out.println("4- Transferir dinheiro da conta 2 para conta 1");
      System.out.println("5- Transferir dinheiro da conta 2 para conta 0");
      System.out.println("6- Exibir saldo conta 0");
      System.out.println("7- Exibir saldo conta 1");
      System.out.println("8- Exibir saldo conta 2");
      System.out.println("9- Sair");
      System.out.print("Opção:");
      op = entrada.nextInt();

      switch (op) {
        case 0:
          System.out.print("Digite a quantia que deseja tranferir:");
          valor = entrada.nextInt();
          conta_0.tranfere(conta_1, valor);

          break;
        case 1:
          System.out.print("Digite a quantia que deseja tranferir:");
          valor = entrada.nextInt();
          conta_0.tranfere(conta_2, valor);
          break;
        case 2:
          System.out.print("Digite a quantia que deseja tranferir:");
          valor = entrada.nextInt();
          conta_1.tranfere(conta_0, valor);
          break;
        case 3:
          System.out.print("Digite a quantia que deseja tranferir:");
           valor = entrada.nextInt();
          conta_1.tranfere(conta_2, valor);
          break;
        case 4:
          System.out.print("Digite a quantia que deseja tranferir:");
          valor = entrada.nextInt();
          conta_2.tranfere(conta_0, valor);
          break;
        case 5:
          System.out.print("Digite a quantia que deseja tranferir:");
          valor = entrada.nextInt();
          conta_2.tranfere(conta_1, valor);
          break;
        case 6:
          System.out.println("Saldo conta 0:");
          conta_0.mostrarsaldo();
          break;
        case 7:
          System.out.println("Saldo conta 1:");
          conta_1.mostrarsaldo();
          break;
        case 8:
          System.out.println("Saldo conta 2:");
          conta_2.mostrarsaldo();
        default:
          System.out.println("Encerrando programa...");
          break;
      }
    }
    entrada.close();
  }
}
