package Aula_19;

public class Main {
    public static void main(String[] args) {
        Thread t1 = new Thread(new Contador1());
        t1.start();

        Thread t2 = new Thread(new Contador2());
        t2.start();

        Thread t3 = new Thread(new Contador3());         
        t3.start();
    }
} 