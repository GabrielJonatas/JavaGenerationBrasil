package exercicio4;

import java.util.Scanner;

public class Program {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		
		byte idade = 0;

		byte identidadeDeGenero = 0;
		
		byte pessoaDesenvolvedora = 0;
		
		byte contadorCondicao1 = 0;
		byte contadorCondicao2 = 0;
		byte contadorCondicao3 = 0;
		byte contadorCondicao4 = 0;
		
		byte contadorPesquisa = 0;
		
		float somatorioIdade = 0;
		
		char continuarOuNao = 'S';
		
		while (continuarOuNao != 'N') {
			contadorPesquisa++;
			
			System.out.print("Idade: ");
			idade = sc.nextByte();
			
			System.out.print("Identidade de Gênero: ");
			identidadeDeGenero = sc.nextByte();
				
			System.out.print("Pessoa Desenvolvedora: ");		
			pessoaDesenvolvedora = sc.nextByte();
				
			somatorioIdade += idade;
			
			if(pessoaDesenvolvedora == 1) {
				contadorCondicao1++;
			} else if (pessoaDesenvolvedora == 2) {
				if(identidadeDeGenero == 1 || identidadeDeGenero == 4) {
					contadorCondicao2++;
				}
			} else if (pessoaDesenvolvedora == 3) {
				if((identidadeDeGenero == 2 || identidadeDeGenero == 5) && idade > 40) {
					contadorCondicao3++;
				}		
			} else if (pessoaDesenvolvedora == 4) {
				if(identidadeDeGenero == 3 && idade < 30) {
					contadorCondicao4++;
				}				
			}
 			
			System.out.print("\nDeseja continuar (S/N): ");		
			continuarOuNao = sc.next().charAt(0);
			System.out.println("");		
		}
		
		sc.close();

		System.out.printf("Total pessoas desenvolvedoras Backend: %d\n", contadorCondicao1);		
		System.out.println();
		System.out.printf("Total de Mulheres Cis e Trans desenvolvedoras Frontend: %d\n", contadorCondicao2);
		System.out.println();		
		System.out.printf("Total de Homens Cis e Trans desenvolvedores Mobile maiores de 40 anos: %d\n", contadorCondicao3);
		System.out.println();		
		System.out.printf("Total de Pessoas Não Binárias desenvolvedoras FullStack menores de 30 anos: %d\n", contadorCondicao4);
		System.out.println();		
		System.out.printf("O número total de pessoas que responderam à pesquisa: %d\n", contadorPesquisa);
		System.out.println();		
		System.out.printf("A média de idade das pessoas que responderam à pesquisa: %.2f\n", somatorioIdade/contadorPesquisa);	
		
	}

}
