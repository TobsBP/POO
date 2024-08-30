package Aula_07;

public class Main {
  public static void main(String[] args) {
    int array[][];
    array = new int[5][5];

    for (int i = 0; i < array.length; i++)
      for (int j = 0; j < array[i].length; j++)
        array[i][j] = i + j;

    for (int[] is : array)
      for (int is1 : is)
        System.out.println(is1);

  }
}