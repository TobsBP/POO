package Aula_12;

class Main {

    public static void main(String[] args) {
        // Em italico é abstrato no uml

        // Classe abstrata, exemplo a classe Brownie brownie
        // Ela deve ser usada como refenrecia para permitir o poliformismo ou seja
        // abstrato

        // brownie = new Brownie() Não vai dar certo pois ela é abstrata

        // Pode ser criado pois não e abstrata
        BrownieNutella bNutella = new BrownieNutella("Brownie de Nutella", 12.15, "Nutella");

        bNutella.getNome();

        // É uma sub classe que sobrescreve o metodo da classe Brownie
        bNutella.addCarrinhoDeCompras();
    }
}