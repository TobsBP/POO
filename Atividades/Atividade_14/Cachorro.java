package Atividades.Atividade_14;

public class Cachorro extends Mamifero{
    public Cachorro(String nome, double vida){
        super(nome, vida);
    }

    @Override
    public void emitirSon() {
        System.out.println("Au Au");
    }
}
