package Aula_10.Brownies;

public class Brownie {
    // São publicos para essa herança
    protected String nome, sabor;
    protected float preco;

    public Brownie(String nome, float preco, String sabor){
        this.nome = nome;
        this.preco = preco;
        this.sabor = sabor;
    }

    public void addCarrinhoDeCompras(){
        System.out.println("Adicionado ao carrinho.");
    }

    public void calculaValorTotal(){
        System.out.println("Total: 20$");
    }

    public void mostraInfo(){
        System.out.println("Nome: " + nome);
        System.out.println("Sabor: " + sabor);
        System.out.println("Preço: " + preco);
    }
}