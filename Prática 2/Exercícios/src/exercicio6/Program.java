package exercicio6;

import java.util.Locale;
import java.util.Scanner;

public class Program {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		
		Scanner sc = new Scanner(System.in);
		
		System.out.print("Nome do colaborador: ");
		String nomeColaborador = sc.nextLine();
		
		System.out.print("Cargo: ");
		int codigoDoCargo = sc.nextInt();
		
		System.out.print("Salário: ");
		float salario = sc.nextFloat();
	
		sc.close();
		
		System.out.println();
		
		switch(codigoDoCargo) {
		  case 1:
			  System.out.printf("Nome do colaborador: %s", nomeColaborador);
			  System.out.println("\nCargo: Gerente");
			  System.out.printf("Salário: R$ %.2f", salario*1.1);
			  break;
		  case 2:
			  System.out.printf("Nome do colaborador: %s", nomeColaborador);
			  System.out.println("\nCargo: Vendedor");
			  System.out.printf("Salário: R$ %.2f", salario*1.07);
			  break;
		  case 3:
			  System.out.printf("Nome do colaborador: %s", nomeColaborador);
			  System.out.println("\nCargo: Supervisor");
			  System.out.printf("Salário: R$ %.2f", salario*1.09);
			  break;
		  case 4:
			  System.out.printf("Nome do colaborador: %s", nomeColaborador);
			  System.out.println("\nCargo: Motorista");
			  System.out.printf("Salário: R$ %.2f", salario*1.06);
			  break;
		  case 5:
			  System.out.printf("Nome do colaborador: %s", nomeColaborador);
			  System.out.println("\nCargo: Estoquista");
			  System.out.printf("Salário: R$ %.2f", salario*1.05);
			  break;
		  case 6:
			  System.out.printf("Nome do colaborador: %s", nomeColaborador);
			  System.out.println("\nCargo: Técnico de TI");
			  System.out.printf("Salário: R$ %.2f", salario*1.08);
			  break;
		  default:
		    System.out.println("");
		}

	}

}
