package Atividades.Atividade_13.Brownies;

public class BrownieNutella extends Brownie {
    public BrownieNutella(String nome, double valor, String sabor) {
        super(nome, valor, sabor);
    }

    public void AddNutela() {
        System.out.println("Nutella, adcionada!");
    }

    @Override
    public void addCarrinhoDeCompras(){
        System.out.println("Brownie de Nutella adcionado ao carrinho!");
    }
}