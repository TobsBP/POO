package Atividades.Atividade_08;

public class Main {
  public static void main(String[] args) {
    Piloto piloto1 = new Piloto();
    Piloto piloto2 = new Piloto();
    Kart kart1 = new Kart();
    Kart kart2 = new Kart();
  
    kart1.nome = "kart1";
    kart2.nome = "kart2";

    kart1.motor.velocidadeMaxima = 237;
    kart1.motor.cilindradas = "Ventuz";

    kart2.motor.velocidadeMaxima = 180;
    kart2.motor.cilindradas = "Renegade";

    piloto1.nome = "Piloto1";
    piloto2.nome = "Piloto2";

    // Agregação
    kart1.piloto = piloto1;
    kart2.piloto = piloto2;

    // So chamar os metodos a baixo
  }
}
