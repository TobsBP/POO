package PCMania;

public class MemoriaUSB {
    public String nome;
    public int capacidade;

    MemoriaUSB (String nome, int capacidade){
        this.nome = nome;
        this.capacidade = capacidade;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public int getCapacidade() {
        return capacidade;
    }

    public void setCapacidade(int capacidade) {
        this.capacidade = capacidade;
    }
}