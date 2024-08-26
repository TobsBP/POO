package Atividades.Atividade_09;

public class Cantina {
  String nome;

  void addSalgado(Salgado novoSalgado){
    nome = novoSalgado.nome;
  }

  void mostraSalgado(){
    System.out.println(nome);
  }
  
}