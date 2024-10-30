package exercicio5;

import java.util.Scanner;

public class Program {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		
		int numero = 0;
		int somaDosPositivos = 0;
		
		do {
			System.out.print("Digite um número: ");
			numero = sc.nextInt();
			System.out.println();
			if (numero > 0) somaDosPositivos += numero;
		} while(numero != 0);
		
		System.out.printf("A soma dos números positivos é: %d",somaDosPositivos);
		
		sc.close();
	}

}
