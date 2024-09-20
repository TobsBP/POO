package Atividades.Atividade_13.Brownies;

public class BrownieDoceDeLeite extends Brownie{
    public BrownieDoceDeLeite(String nome, double valor, String sabor) {
        super(nome, valor, sabor);
    }   

    public void addDoceDeLeite(){
        System.out.println("Doce de leite, adcionado!");
    }


    @Override
    public void addCarrinhoDeCompras(){
        System.out.println("Brownie de Doce de Leite adcionado ao carrinho!");
    }
}