package Atividades.Atividade_13;

import Atividades.Atividade_13.Brownies.BrownieCafe;
import Atividades.Atividade_13.Brownies.BrownieDoceDeLeite;
import Atividades.Atividade_13.Brownies.BrownieNutella;

public class Main {
    public static void main(String[] args) {
        BrownieDoceDeLeite bDoce = new BrownieDoceDeLeite("Brownie Doce de Leite", 15.50, "Doce de letite");
        BrownieNutella bNutella = new BrownieNutella("Brownie de Nutella", 12.15, "Nutella");
        BrownieCafe bCafe = new BrownieCafe("Brownie Cafe", 15.75, "Cafe");
        Comprador comprador = new Comprador("Jorge", 200);
        
        bNutella.addCarrinhoDeCompras();
        bCafe.addCarrinhoDeCompras();
        bDoce.addCarrinhoDeCompras();

        comprador.efetuaCompra(bCafe);
    }   
}