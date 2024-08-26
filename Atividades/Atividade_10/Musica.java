package Atividades.Atividade_10;

public class Musica {
  private String nome;
  private double duracao;

  public Musica(String nome, double d) {
    this.nome = nome;
    this.duracao = d;
  }

  // Getter e Setters
  public String getNome() {
    return nome;
  }

  public void setNome(String nome) {
    this.nome = nome;
  }

  public double getDuracao() {
    return duracao;
  }

  public void setDuracao(float duracao) {
    this.duracao = duracao;
  }

}