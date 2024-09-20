package Atividades.Atividade_13.Brownies;

public class BrownieCafe extends Brownie{
    public BrownieCafe(String nome, double valor, String sabor) {
        super(nome, valor, sabor);
    }

    @Override
    public void addCarrinhoDeCompras(){
        System.out.println("Brownie de Cafe adcionado ao carrinho!");
    }

    public void addCafe(){
        System.out.println("Café, adcionado!");
    }
}