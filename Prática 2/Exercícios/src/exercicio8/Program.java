package exercicio8;

import java.util.Locale;
import java.util.Scanner;

public class Program {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		
		Scanner sc = new Scanner(System.in);

		System.out.print("Operação: ");
		int operacao = sc.nextInt();
		
		float saldo = 1000;
		
		System.out.println();

		switch(operacao) {
		  case 1:
			  System.out.println("Operação - Saldo");
			  System.out.printf("Saldo: R$ %.2f", saldo);
			  break;
		  case 2:
			  System.out.println("Operação - Saque");
			  System.out.print("Valor: R$ ");
			  float saque = sc.nextFloat();
			  if(saque < saldo) {
				  saldo -= saque;
				  System.out.printf("Novo Saldo: R$ %.2f", saldo);
			  } else {
				  System.out.println("Saldo Insuficiente");
			  }
			  break;
		  case 3:
			  System.out.println("Operação - Deposito");
			  System.out.print("Valor: R$ ");
			  saldo += sc.nextFloat();
			  System.out.printf("Novo Saldo: R$ %.2f", saldo);
			  break;
		  default:
			System.out.print("Valor: R$ ");
			float desconhecido = sc.nextFloat();
		    System.out.println("Operação Inválida!");
		}
		
		sc.close();
	}

}
