package Atividades.Atividade_16;

public abstract class Pessoa implements Comparable<Pessoa> {
    private String nome;
    private int idade;

    Pessoa(String nome, int idade) {
        this.nome = nome;
        this.idade = idade;
    }

    @Override
    public int compareTo(Pessoa p) {
        if (this.idade > p.idade) {
            return -1;
        } else if (this.idade < p.idade) {
            return 1;
        } else {
            return 0;
        }
    }

    public String getNome() {
        return nome;
    }

    public int getIdade() {
        return idade;
    }
}
