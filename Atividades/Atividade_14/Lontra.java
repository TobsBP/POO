package Atividades.Atividade_14;

public class Lontra extends Mamifero {
    public Lontra (String nome, double vida){
        super(nome, vida);
    }

    @Override
    public void emitirSon() {
        System.out.println("Miau");
    }
}