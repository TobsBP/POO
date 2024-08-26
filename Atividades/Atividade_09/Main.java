package Atividades.Atividade_09;

public class Main {
  public static void main(String[] args) {
    Salgado salgados[] = new Salgado[3];
    Cantina cantina = new Cantina();
    
    cantina.nome = "Cantina do Inatel";
    
    for (int i = 0; i < salgados.length; i++)
      salgados[i] = new Salgado();

    // salgados[0] = new Salgado();
    salgados[0].nome = "Coxinha";

    // salgados[1] = new Salgado();
    salgados[1].nome = "Bolo";

    // salgados[2] = new Salgado();
    salgados[2].nome = "Empada";
    
    for (int i = 0; i < salgados.length; i++) 
      cantina.addSalgado(salgados[i]);

    for (Salgado salgado : salgados)
      System.out.println(salgado.nome);

  }
} 