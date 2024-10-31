package exercicio6;

import java.util.Scanner;

public class Program {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		
		int numero = 0;
		float somatorio = 0;
		int contador = 0;
		
		do {
			System.out.print("Digite um número: ");
			numero = sc.nextInt();
			System.out.println();
			if (numero != 0 && numero%3 == 0) {
				somatorio += numero;
				contador++;
			}
		} while(numero != 0);
		
		System.out.printf("A média de todos os números múltiplos de 3 é: %.1f", somatorio/contador);
		
		sc.close();
	}

}
