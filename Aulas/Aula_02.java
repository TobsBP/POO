import java.util.Scanner;

public class Aula_02 {
  public static void main(String[] args) {
    System.out.print("Escolha uma opção (1,2,3): ");

    Scanner entrada = new Scanner(System.in);
    
    int choose = entrada.nextInt();
    
    entrada.close();

    switch (choose) {
      case 1:
        System.out.println("Opção 1º");
      case 2:
        System.out.println("Opção 2º");
        break;
      case 3:
        System.out.println("Opção 3º");        
        break;
      default:
        System.out.println("Opção errada!");
    }
  }
}     
