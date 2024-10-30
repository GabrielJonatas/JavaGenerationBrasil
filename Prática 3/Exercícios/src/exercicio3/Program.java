package exercicio3;

import java.util.Scanner;

public class Program {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		
		byte idade = 0, menoresQueVinteUm = 0, maioresQueCinquenta = 0;
		boolean condicao = true;
		
		while(condicao) {
			System.out.print("Digite uma idade: ");
			
			idade = sc.nextByte();
			
			if (idade >= 0) {
				if(idade < 21) menoresQueVinteUm++; 
				else if (idade > 50) maioresQueCinquenta++;
			} else {
				condicao = false;
			}
			
			System.out.println("");
		}
		
		sc.close();
		
		System.out.printf("Total de pessoas menores de 21 anos: %d\n", menoresQueVinteUm);
		System.out.printf("Total de pessoas maiores de 50 anos: %d", maioresQueCinquenta);
	}

}
