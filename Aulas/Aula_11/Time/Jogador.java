package Aula_11.Time;

public class Jogador {
    String nome, pos;
    int num_camisa;

    public Jogador(String nome, String pos, int num_camisa){
        this.num_camisa = num_camisa;
        this.nome = nome;
        this.pos = pos;
    }

    public void action(){
        System.out.println("Jogador");
    }

    public String getNome() {
        return nome;
    }

    public String getPos() {
        return pos;
    }

    public int getNum_camisa() {
        return num_camisa;
    }
}