package Atividades.Atividade_07;

public class Arma {
  int poder, resistencia, descrição;
  String nome;

  void mostrarInfoArma(){
    System.out.println("Nome: " + nome);
    System.out.println("Resistencia: " + resistencia);
    System.out.println("Descrição: " + descrição);
    System.out.println("Poder: " + poder);
  }
}