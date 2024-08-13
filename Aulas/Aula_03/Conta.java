package Aula_03;
import java.util.Scanner;

public class Conta {
  float saldo;
  String nome;
  int code;

  void input(){
    Scanner entrada = new Scanner(System.in);
    
    System.out.print("Digite o nome de usuario: ");
    nome = entrada.next();

    System.out.print("Digite o codigo da conta: ");
    code = entrada.nextInt();
    
    System.out.print("Digite o saldo da conta: ");
    saldo = entrada.nextFloat();

    entrada.close();
  }

  void info(){
    System.out.println("O nome de usuario é: " + nome);
    System.out.println("O codigo da conta é: " + code);
    System.out.println("Saldo da conta: " + saldo);
  }
} 