package Aula_11.Time;

public class Zagueiro extends Jogador{
    public Zagueiro(String nome, String pos, int num_camisa){
        super(nome, pos, num_camisa);
    }

    @Override
    public void action(){
        System.out.println("Marcou!");
    }
}