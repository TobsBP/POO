package Atividades.Atividade_07;

public class Main {
  public static void main(String[] args) {
    Personagem personagem1 = new Personagem();
    Arma arma = new Arma();

    arma.nome = "AK 47";
    personagem1.arma = arma;
    personagem1.tomarDano();   
    personagem1.arma.mostrarInfoArma();
  }
}