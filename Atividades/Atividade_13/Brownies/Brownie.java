package Atividades.Atividade_13.Brownies;

public class Brownie {
    protected String nome, sabor;
    protected double valor;

    Brownie(String nome, double valor, String sabor){
        this.nome = nome;
        this.valor = valor;
        this.sabor = sabor;
    }

    public void addCarrinhoDeCompras(){
        System.out.println("Adcionado ao carrinho de compras");
    }

    public void calculaValorTotalCompra(){
        System.out.println(this.nome);
        System.out.println(this.valor);
    }

    public void mostraInfo(){
        System.out.println(this.nome);
        System.out.println(this.sabor);
        System.out.println(this.valor);
    }

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