package Atividades.Atividade_13;

import Atividades.Atividade_13.Brownies.Brownie;

public class Comprador {
    private String nome;
    private double saldo;

    public Comprador(String nome, double saldo){
        this.nome = nome;
        this.saldo = saldo;
    }

    public void efetuaCompra(Brownie brownie){
        brownie.addCarrinhoDeCompras();
        brownie.calculaValorTotalCompra();
        System.out.println("Brownie comprado: " + brownie.getNome());
    }

    public String getNome() {
        return nome;
    }

    public double getSaldo() {
        return saldo;
    }
}