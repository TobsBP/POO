package Atividades.Atividade_15;

public class Lontra extends Mamifero implements Interface{
    public Lontra (String nome, double vida){
        super(nome, vida);
    }

    @Override
    public void emitirSon() {
        System.out.println("Miau");
    }

    @Override
    public void nadar(){
        System.out.println("Sei nadar!");
    }
}