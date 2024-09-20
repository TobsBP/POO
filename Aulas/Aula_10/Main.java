package Aula_10;

import Aula_10.Brownies.Brownie;
import Aula_10.Brownies.BrownieNutela;
import Aula_10.Brownies.BrowniePacoca;

public class Main {
    public static void main(String[] args) {
        BrownieNutela brownie_01 = new BrownieNutela("Black", 15, "Nutela");
        BrowniePacoca brownie_02 = new BrowniePacoca("Marrom", 15, "Paçoca");
        
        brownie_01.Nutela();
        brownie_02.Pacoca();

        // Da para adicionar eles em um vetor de brownies, pois são dos tipos brownies
        Brownie brownies[] = new Brownie[5];

        brownies[0] = brownie_01;
        brownies[1] = brownie_02;
        
        // Brownie brownie_03 = new BrowniePacoca("Marrom", 15, "Paçoca");
        // Não é possivel acessar brownie_03.Pacoca();
    }
}