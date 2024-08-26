package Aula_05.Contrutor;

public class Main {
  public static void main(String[] args) {
    Empresa empresa = new Empresa();
    empresa.dep.nome = "MG SUL";

    System.out.println(empresa.dep.nome);
  }
}