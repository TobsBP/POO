package Atividades.Atividade_10;

import java.util.Random;

public class Campo {
  boolean[][] novoCampo(boolean[][] novoCampo){
    for (int i = 0; i < novoCampo.length; i++) {
      for (int j = 0; j < novoCampo.length; j++) {
        novoCampo[i][j] = false;
      }
    }

    Random rand = new Random();

    int x = rand.nextInt(2);
    int y = rand.nextInt(2);

    novoCampo[x][y] = true;

    return novoCampo;
  }
}
