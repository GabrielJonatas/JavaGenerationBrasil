package exercicio7;

import java.util.Locale;
import java.util.Scanner;

public class Program {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		
		Scanner sc = new Scanner(System.in);
		
		System.out.print("Digite o 1° numero: ");
		float numero1 = sc.nextFloat();
		
		System.out.println();
		
		System.out.print("Digite o 2° numero: ");
		float numero2 = sc.nextFloat();

		System.out.println();
		
		System.out.print("Operacao: ");
		int operacao = sc.nextInt();
		
		float resultado;
	
		sc.close();
		
		System.out.println();
		
		switch(operacao) {
		  case 1:
			  resultado = numero1 + numero2;
			  System.out.printf("%.1f + %.1f = %.1f", numero1, numero2, resultado);
			  break;
		  case 2:
			  resultado = numero1 - numero2;
			  System.out.printf("%.1f - %.1f = %.1f", numero1, numero2, resultado);
			  break;
		  case 3:
			  resultado = numero1 * numero2;
			  System.out.printf("%.1f * %.1f = %.1f", numero1, numero2, resultado);
			  break;
		  case 4:
			  resultado = numero1/numero2;
			  System.out.printf("%.1f / %.1f = %.1f", numero1, numero2, resultado);
			  break;
		  default:
		    System.out.println("Operação Inválida!");
		}

	}

}
