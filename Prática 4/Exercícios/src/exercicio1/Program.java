package exercicio1;

import java.util.Scanner;

public class Program {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		int[] vetor = new int[10];
	
		for(int j= 0; j<10; j++) {
			System.out.printf("Digite o %dº elemento do vetor: ", j+1);
			vetor[j] = sc.nextInt();
		}
	
		System.out.println("");
		
		System.out.print("Digite o número que você deseja encontrar: ");

		int numero = sc.nextInt();
		
		System.out.println("");		
		
		boolean condicao = false;
		int contador = 0;
		int posicao = 0;
		
		while(!condicao && contador < 10) {
			if(vetor[contador] == numero) {
				condicao = true;
				posicao = contador;
			} else {
				contador++;
			}
		}
		
		if (condicao) {
			System.out.printf("O número %d está localizado na posição: %d", numero, posicao);
		} else {
			System.out.printf("O número %d não foi encontrado!",numero);			
		}
		
		sc.close();
	}

}
