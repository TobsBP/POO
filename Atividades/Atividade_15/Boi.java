package Atividades.Atividade_15;

public class Boi extends Mamifero {
    
    public Boi(String nome, double vida){
        super(nome, vida);
    }
    
    @Override
    public void emitirSon() {
        System.out.println("Muuu");
    }
    
}
