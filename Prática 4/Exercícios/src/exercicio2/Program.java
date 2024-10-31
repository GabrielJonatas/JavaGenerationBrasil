package exercicio2;

import java.util.Scanner;

public class Program {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		int[] vetor = new int[10];
		int somatorio = 0;
		
		for(int i= 0; i<10; i++) {
			System.out.printf("Digite o %dº elemento do vetor: ", i+1);
			vetor[i] = sc.nextInt();
			somatorio += vetor[i];
		}
		
		float media = (float) somatorio/10;
	
		System.out.println("");
		
		System.out.println("Elementos nos índices ímpares:");

		for (int i = 1; i<10; i += 2) {
			System.out.printf("%d ", vetor[i]);
		}
		
		System.out.println("\n");		

		System.out.println("Elementos pares:");
		
		for (int i = 0; i<10; i++) {
			if(vetor[i]%2 == 0) {
				System.out.printf("%d ", vetor[i]);				
			}
		}

		System.out.println("\n");		
		
		System.out.printf("Soma: %d", somatorio);		
		
		System.out.println("\n");		
		
		System.out.printf("Média: %.2f", media);		
		
		sc.close();
	}

}

