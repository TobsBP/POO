package Atividades.Atividade_08;

public class Kart {
  Piloto piloto;
  String nome;
  Motor motor;

  // Associação
  public Kart(){
    motor = new Motor();
  }

  void pular(){
    System.out.println("Pulo!");
  }

  void soltaTurbo(){
    System.out.println("Turbo!");
  }

  void fazerDrift(){
    System.out.println("Drifit!");
  }
}