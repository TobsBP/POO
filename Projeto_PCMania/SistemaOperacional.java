package Projeto_PCMania;

public class SistemaOperacional {
    private String nome;
    private int tipo;

    SistemaOperacional(String nome, int tipo){
        this.nome = nome;
        this.tipo = tipo;
    }

    public String getNome() {
        return nome;
    }

    public int getTipo() {
        return tipo;
    }
}