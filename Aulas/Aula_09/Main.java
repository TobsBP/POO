package Aula_09;

public class Main {
    public static void main(String[] args) {
        // Exemplo de construtor
        Pessoa person_01 = new Pessoa("Bolsonaro", 60);
        Pessoa person_02 = new Pessoa("Lula", 53);

        System.out.println("Ex presidente: " + person_01.getNome());

        System.out.println("Presidente: " + person_02.getNome());

        // Exemplo de static
        Bloco bloco_00 = new Bloco();
        Bloco bloco_01 = new Bloco();

        bloco_00.getNome();
        bloco_01.getNome();

        // OBS: Nome da classe, pois o atributo numBlocos é da classe
        System.out.println(Bloco.getNumBlocos());

        // Metodo statico, não precisa existir uma instancia para chamar
        Bloco.ExStatic();
    }
}