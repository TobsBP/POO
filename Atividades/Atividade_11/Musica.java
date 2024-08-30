package Atividades.Atividade_11;

public class Musica {
  private String nome;
  private double duracao;

  Musica(String nome, double d) {
    this.nome = nome;
    this.duracao = d;
  }

  String getNome() {
    return nome;
  }

  void setNome(String nome) {
    this.nome = nome;
  }

  double getDuracao() {
    return duracao;
  }

  void setDuracao(float duracao) {
    this.duracao = duracao;
  }
}