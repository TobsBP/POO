package Projeto_PCMania;

public class HardwareBasico {
    private String nome;
    private float capacidade;

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public float getCapacidade() {
        return capacidade;
    }

    public void setCapacidade(float capacidade) {
        this.capacidade = capacidade;
    }

    HardwareBasico(String nome, float capacidade){
        this.nome = nome;
        this.capacidade = capacidade;
    }
}