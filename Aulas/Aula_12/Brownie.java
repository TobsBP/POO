package Aula_12;

public abstract class Brownie {
    protected String nome, sabor;
    protected double valor;

    public Brownie(String nome, double valor, String sabor) {
        this.nome = nome;
        this.sabor = sabor;
        this.valor = valor;
    }

    // As outras sub classes devem sobrescrever este metodo
    public abstract void addCarrinhoDeCompras();

    public String getNome() {
        return nome;
    }

    public String getSabor() {
        return sabor;
    }

    public double getValor() {
        return valor;
    }

    
}