package Atividades.Atividade_09;

public class Main {
  public static void main(String[] args) {
    Cantina cantina = new Cantina();

    cantina.nome = "Cantina do Inatel";

    Salgado salgado_01 = new Salgado();
    Salgado salgado_02 = new Salgado();
    Salgado salgado_03 = new Salgado();

    salgado_01.nome = "Coxinha";
    salgado_02.nome = "Empada";
    salgado_03.nome = "Pastel";

    cantina.addSalgado(salgado_01);
    cantina.addSalgado(salgado_02);
    cantina.addSalgado(salgado_03);

    cantina.mostraSalgado();
  }
}