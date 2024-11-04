package Atividades.Atividade_19;

public class Pessoa {
    private String nome;
    private double saldo;

    public Pessoa(String nome, double saldo) {
        this.nome = nome;
        this.saldo = saldo;
    }

    public String getNome() {
        return this.nome;
    }

    public double getSaldo() {
        return this.saldo;
    }
}
