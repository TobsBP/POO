package Atividades.Atividade_18;

public class Pessoa {
    String nome;
    int saldo;

    public Pessoa(String nome, int saldo) {
        this.nome = nome;
        this.saldo = saldo;
    }

    public String getNome() {
        return this.nome;
    }

    public int getSaldo() {
        return this.saldo;
    }
}
