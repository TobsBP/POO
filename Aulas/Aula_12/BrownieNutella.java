package Aula_12;

public class BrownieNutella extends Brownie{
    public BrownieNutella(String nome, double valor, String sabor) {
        super(nome, valor, sabor);
    }

    @Override
    public void addCarrinhoDeCompras() {
        System.out.println("Brownie de Nutella adicionado ao carrinho de compras");
    }
}