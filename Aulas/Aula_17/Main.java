package Aula_17;

// import java.io.FileInputStream;
// import java.io.FileNotFoundException;

public class Main {
    public static void main(String[] args) {
        try {
            metodo();   
        } catch (CheckedException e) { // Use CheckedException, que é uma exceção verificada
            System.out.println("Erro: " + e);
        }
    }

    private static void metodo() throws CheckedException {
        // try {
            // FileInputStream file = new FileInputStream("arquivo.txt");
        // } catch (FileNotFoundException e) {
            // Lança a CheckedException com uma mensagem personalizada
            // throw new CheckedException("Arquivo inexistente!");
        // }
    }
}