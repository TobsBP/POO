package Atividades.Atividade_14;

public abstract class Mamifero {
    protected String nome;
    protected double vida;

    public abstract void emitirSon();

    public Mamifero(String nome, double vida){
        this.nome = nome;
        this.vida = vida;
    }

    public void mostraInfo(){
        System.out.println("Nome: " + nome);
        System.out.println("Vida: " + vida);
    }
}