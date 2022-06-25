package JavaCompleto.Exercicios._11_Matrizes;

import java.util.Scanner;

public class _11_Main {

  public static void main(String[] args) {

    System.out.println();
    System.out.println("EXERCICIOS - MATRIZES");
    System.out.println("Fazer um programa para ler dois números inteiros M e N, e depois ler " +
            "uma matriz de M linhas por N colunas contendo números inteiros, " +
            "podendo haver repetições. Em seguida, ler um número inteiro X que " +
            "pertence à matriz. Para cada ocorrência de X, mostrar os valores à " +
            "esquerda, acima, à direita e abaixo de X, quando houver, conforme " +
            "exemplo.");

    Scanner sc = new Scanner(System.in);

    System.out.println();
    System.out.print("Digite o número de linhas da matriz: ");
    int linhasMatriz = sc.nextInt();

    System.out.print("Digite o número de colunas da matriz: ");
    int colunasMatriz = sc.nextInt();

    int matriz[][] = new int[linhasMatriz][colunasMatriz];

    for (int i = 0; i < matriz.length; i++){
      for (int j = 0; j < matriz[i].length; j++){
        System.out.print("Digite um número inteiro: ");
        matriz[i][j] = sc.nextInt();
      }
    }

    System.out.println("------------------------");
    System.out.println("Matriz Inteira: ");
    for (int i = 0; i < matriz.length; i++){
      for (int j = 0; j < matriz[i].length; j++){
        System.out.print(matriz[i][j] + " ");
      }
      System.out.println();
    }

    System.out.println("------------------------");
    System.out.print("Digite o número que deseja encontrar na matriz: ");
    int buscarNumero = sc.nextInt();

    IndexOutOfBoundsException erro = new IndexOutOfBoundsException();

    for (int i = 0; i < matriz.length; i++){
      for (int j = 0; j < matriz[i].length; j++){
        if(buscarNumero == matriz[i][j]){
          System.out.println("Posição:  " + i + ", " + j);
          if (j > 0) System.out.println("Esquerda: " + matriz[i][j - 1]);
          if (j < matriz[i].length - 1) System.out.println("Direita:  " + matriz[i][j + 1]);
          if (i > 0) System.out.println("Acima:    " + matriz[i - 1][j]);
          if (i < matriz.length - 1) System.out.println("Abaixo:   " + matriz[i + 1][j]);
        }
      }
    }


  }
}
