package JavaCompleto.Exercicios._09_Listas;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class _09_Main {
  public static void main(String[] args) {

    Scanner sc = new Scanner(System.in);

    System.out.println();
    System.out.println("EXERCICIO - LISTAS");
    System.out.println("Fazer um programa ler um número inteiro N e depois " +
            "os dados (id, nome, salario) de N funcionários. Não deve haver " +
            "repetição de id.\n" +
            "Em seguida, efetuar o aumento de X por cento no salário de um " +
            "determinado funcionário. Para isso, o programa deve ler um id " +
            "e o valor X. Se o id informado não existir, mostrar uma " +
            "mensagem e abortar a operação. Ao final, mostrar a listagem " +
            "atualizada dos funcionários. \n" +
            "Lembre-se de aplicar a técnica de encapsulamento para não " +
            "permitir que o salário possa ser mudado livremente. Um " +
            "salário só pode ser aumentado com base em uma operação de " +
            "aumento por porcentagem dada.");

    List<_09_Empregado> listaEmpregados = new ArrayList<>();

    System.out.println();
    System.out.print("Digite quantos empregados serão registrados: ");
    int totalEmpregados = sc.nextInt();

    for (int i = 1; i <= totalEmpregados; i++){

      System.out.println("---------------------------");
      System.out.println("Empregado: #" + i);

      System.out.print("Digite o ID do empregado     : ");
      int id = sc.nextInt();

      System.out.print("Digite o nome do empregado   : ");
      sc.nextLine();
      String nome = sc.nextLine();

      System.out.print("Digite o salario do empregado: ");
      Double salario = sc.nextDouble();

      listaEmpregados.add(new _09_Empregado(id, nome, salario));

    }

    System.out.println();
    System.out.print("Digite o ID do empregado que irá receber aumento: ");
    int procurarId = sc.nextInt();

    int encontrouEmpregado = 0;

    for ( _09_Empregado empregado : listaEmpregados) {
      if(empregado.getId() == procurarId){
        System.out.print("Digite a porcentagem do aumento: ");
        double porcentagemAumento = sc.nextDouble();
        empregado.aumentarSalario(porcentagemAumento);
      } else {
        encontrouEmpregado++;
      }
    }

    if (encontrouEmpregado == totalEmpregados){
      System.out.println("O empregado com esse ID " + procurarId + " não foi encontrado.");
    }

    System.out.println();
    System.out.println("Lista de empregados: ");
    for ( _09_Empregado empregado : listaEmpregados) {
      System.out.println(empregado);
    }

  }
}
