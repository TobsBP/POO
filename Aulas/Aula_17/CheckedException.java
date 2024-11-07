package Aula_17;

public class CheckedException extends Exception{
    public CheckedException(String message) {
        super("Arquivo inexistente!");
    }   
}
