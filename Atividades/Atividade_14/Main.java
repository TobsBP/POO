package Atividades.Atividade_14;

public class Main {
    public static void main(String[] args) {
        Cachorro cachorro = new Cachorro("Cachorro", 100);
        Lontra lontra = new Lontra("Lontra", 100);
        Boi boi =  new Boi("Boi", 100);

        cachorro.emitirSon();
        lontra.emitirSon();
        boi.emitirSon();

    }
}
