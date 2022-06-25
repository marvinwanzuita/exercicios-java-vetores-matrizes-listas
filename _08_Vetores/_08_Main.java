package JavaCompleto.Exercicios._08_Vetores;

import java.util.Scanner;

public class _08_Main {
  public static void main(String[] args) {

    Scanner sc = new Scanner(System.in);

    _08_Pensionato[] vect = new _08_Pensionato[10];

    System.out.println();
    System.out.println("EXERCICIO - VETORES");
    System.out.println("A dona de um pensionato possui dez quartos para" +
            "alugar para estudantes, sendo esses quartos identificados pelos" +
            "0 a 9.\n" +
            "Fazer um programa que inicie com todos os dez quartos vazios, " +
            "e depois leia uma quantidade N representando o número de estudantes " +
            "que vão alugar quartos (N pode ser de 1 a 10). Em seguida, registre " +
            "o aluguel dos N estudantes. Para cada registro de aluguel, informar " +
            "o nome e email do estudante, bem como qual dos quartos ele escolheu " +
            "(0 a 9). Suponha que seja escolhido um quarto vago. Ao final, seu " +
            "programa deve imprimir um relatório de todas as ocupações do pensionato, " +
            "por ordem de quarto.");

    System.out.println();
    System.out.print("Digite o total de estudantes que irão alugar quartos: ");
    int totalEstudantes = sc.nextInt();

    System.out.println();

    for(int i = 0; i < totalEstudantes; i++){

      System.out.println("---------------------------");
      System.out.println("Aluguel: #" + (i + 1));

      System.out.print("Digite o nome do estudante: ");
      sc.nextLine();
      String nomeEstudante = sc.nextLine();

      System.out.print("Digite o email do estudante: ");
      String emailEstudante = sc.nextLine();

      System.out.print("Digite o quarto do estudante: ");
      int quartoEstudante = sc.nextInt();

      vect[quartoEstudante] = new _08_Pensionato(nomeEstudante, emailEstudante, quartoEstudante);

    }
    System.out.println("---------------------------");

    System.out.println("Quartos ocupados: ");
    for (int i = 0; i < vect.length; i++){

      if (vect[i] != null){
        System.out.println(vect[i]);
      }
    }
  }
}
