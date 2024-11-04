package Aula_17;

import java.io.FileInputStream;

public class Main {
    public static void main(String[] args) {
        // A exceção tratada não deixa o codigo nem compilar
        try {
            metodo();   
        } catch (Exception e) {
            System.out.println("File not found!");
        }
    }

    // Quem chamar é obrigado a fazer um try catch
    private static void metodo() throws Exception {
        FileInputStream File = new FileInputStream("arquivo.txt");
        File.close();
    }
}
