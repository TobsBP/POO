package Aula_07;

public class Main {
  public static void main(String[] args) {
    int array[][];
    array = new int[5][5];

    for (int i = 0; i < array.length; i++)
      for (int j = 0; j < array[i].length; j++)
        array[i][j] = i + j;

    System.out.print("Matriz: ");

    for (int[] numbers : array)
      for (int number : numbers)
        System.out.print(number + ", ");

    System.out.println("Etnd!");
  }
}