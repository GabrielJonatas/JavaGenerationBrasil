package exercicio1;

import java.util.Scanner;

public class Program {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		
		System.out.print("Digite o primeiro número do intervalo: ");	
		byte numero1 = sc.nextByte();
		System.out.print("Digite o segundo número do intervalo: ");		
		byte numero2 = sc.nextByte();
		System.out.println("");		
		
		sc.close();
		
		if(numero1<numero2) {
			for(int i = numero1; i<=numero2; i++) {
				if(i%3 == 0 && i%5 == 0) System.out.printf("%d é múltiplo de 3 e 5\n", i);
			}
		} else {
			System.out.println("Intervalo inválido");		
		}
		
		}
}
