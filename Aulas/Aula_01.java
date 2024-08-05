import java.util.Scanner;

public class Aula_01 {
  // Comentarios /* */
  public static void main(String[] args) {
    
    // Variavel tem que ser tipada
    int idade = 15;

    // Mostrando a variavel que ela é somente float
    float teste = 20F;

    // Printando
    System.out.println("Idade: " + idade + "Teste: " + teste);

    // Entrada de dados
    Scanner valorTeclado = new Scanner(System.in);
    
    int valorDigitado =  valorTeclado.nextInt();

    System.out.println("Valor digitado: " + valorDigitado);

    // Uma vez feita a entrada precisa fechar
    valorTeclado.close();

    // Convertendo variaveis
    double num_1 = 3.14;

    // Converte double para int
    int num_2 = (int)num_1;

    // Printando
    System.out.println("Número alterado = " + num_2);
  }
}