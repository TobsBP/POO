package Atividades.Atividade_09;

public class Cantina {
  Salgado salgados[] = new Salgado[3];
  String nome;

  void addSalgado(Salgado novoSalgado) {
    for (int i = 0; i < salgados.length; i++) {
      if (salgados[i] == null) {
        salgados[i] = novoSalgado;
        break;
      }
    }
  }

  void mostraSalgado() {
    for (Salgado salgado : salgados) 
      System.out.println(salgado.nome);
 
  }

}