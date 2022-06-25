package JavaCompleto.Exercicios._10_Matrizes;

import java.util.Scanner;

public class _10_Main {

  public static void main(String[] args) {

    Scanner sc = new Scanner(System.in);

    System.out.println();
    System.out.println("EXERCÍCIO - MATRIZES");
    System.out.println("Fazer um programa para ler um número inteiro N e uma matriz de " +
            "ordem N contendo números inteiros. Em seguida, mostrar a diagonal " +
            "principal e a quantidade de valores negativos da matriz.");

    System.out.println();
    System.out.print("Digite o tamanho da matriz quadrada: ");
    int tamanhoMatriz = sc.nextInt();

    int matriz[][] = new int[tamanhoMatriz][tamanhoMatriz];


    for (int i = 0; i < tamanhoMatriz; i++){
      for (int j = 0; j <tamanhoMatriz; j++){
        System.out.print("Digite um número inteiro: ");
        matriz[i][j] = sc.nextInt();
      }
    }

    System.out.println("------------------------");
    System.out.println("Matriz Inteira: ");
    for (int i = 0; i < tamanhoMatriz; i++){
      for (int j = 0; j < tamanhoMatriz; j++) {
        System.out.print(matriz[i][j] + " ");
      }
      System.out.println();
    }

    System.out.println("------------------------");
    System.out.println("Diagonal principal da matriz: ");
    for (int i = 0; i < tamanhoMatriz; i++){
      for (int j = 0; j < tamanhoMatriz; j++) {
        if(i == j){
          System.out.print(matriz[i][j] + " ");
        }
      }
    }

    System.out.println();
    System.out.println("------------------------");
    System.out.println("Números negativos na matriz: ");
    for (int i = 0; i < tamanhoMatriz; i++){
      for (int j = 0; j < tamanhoMatriz; j++) {
        if(matriz[i][j] < 0){
          System.out.print(matriz[i][j] + " ");
        }
      }
    }


  }
}
