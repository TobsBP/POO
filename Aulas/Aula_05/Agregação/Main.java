package Aula_05.Agregação;

public class Main {
  public static void main(String[] args) {
    Cliente cliente = new Cliente();
    Conta conta = new Conta();

    conta.cliente = cliente;

    conta.cliente.nome = "Jorge";
    conta.cliente.endereço = "Rua Tony";
    conta.cliente.idade = 35;

    System.out.println("Nome: " + conta.cliente.nome);
    System.out.println("Endereço: " + conta.cliente.endereço);
    System.out.println("Idade: " + conta.cliente.idade);
  }
}
