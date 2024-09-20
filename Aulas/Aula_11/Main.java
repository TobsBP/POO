package Aula_11;

import Aula_11.Time.Zagueiro;

public class Main {
    public static void main(String[] args) {
        // Quando estiver sobresquito, vai ser chamado do proprio Zageuiro, não do Jogador
        Zagueiro zg = new Zagueiro("Marquinhos", "Zag", 3);
        
        // Vai ser exibido "marcou!" do methodo do zag não "jogador!" do Jogador
        zg.action();
    }
}