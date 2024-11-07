package Desafio;

import java.nio.file.Files;
import java.nio.file.Path;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        int deslocamento = 3;

        System.out.println("Digite uma frase: ");
        String frase = entrada.nextLine();

        List<String> crip_frase = new ArrayList<>();

        for (char c : frase.toCharArray()) {
            c = (char) ((c + deslocamento));
            crip_frase.add(String.valueOf(c));
        }

        entrada.close();

        Path file = Path.of("../Desafio/crip_frase.txt");

        String fraseFinal = String.join("", crip_frase);
        
        try {
            Files.writeString(file, fraseFinal);
        } catch (Exception e) {
            System.out.println("Erro ao escrever no arquivo: " + e.getMessage());
        }
        
    }
}
