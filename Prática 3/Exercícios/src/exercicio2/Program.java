package exercicio2;

import java.util.Scanner;

public class Program {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int numero = 0;
		int totalNumerosPares = 0;
		int totalNumerosImpares = 0;
		
		for(int i=1; i<=10; i++) {
			System.out.printf("Digite o %d° número: ", i);
			numero = sc.nextInt();
			System.out.println("");
			if (numero%2 == 0) {
				totalNumerosPares++;
			} else {
				totalNumerosImpares++;
			}
		}
		
		System.out.printf("Total de números pares: %d\n", totalNumerosPares);
		System.out.println("");
		System.out.printf("Total de números ímpares: %d\n", totalNumerosImpares);
		
		sc.close();
	}

}
