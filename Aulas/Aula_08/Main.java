package Aula_08;

import Aula_08.Pacote.Conta;

// Isso com Pacotes cai na prova!!

public class Main {
    public static void main(String[] args) {
        Conta conta = new Conta();

        conta.deposito(1000);

        System.out.println(conta.getSaldo());
    }
}