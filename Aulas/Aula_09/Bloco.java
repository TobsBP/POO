package Aula_09;

public class Bloco {
    // Pertence a classe
    private static int numBlocos = 0;
    private String nome;

    public Bloco(){
        numBlocos++;
    }

    public static int getNumBlocos(){
        return numBlocos;
    }

    public String getNome() {
        return nome;
    }

    public static void ExStatic(){
        
    }
}