package PCMania;

public class SistemaOperacional {
    public String nome;
    public int tipo;

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