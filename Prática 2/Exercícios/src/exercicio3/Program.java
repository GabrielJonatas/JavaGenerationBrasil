package exercicio3;

import java.util.Locale;
import java.util.Scanner;

public class Program {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		
		Scanner sc = new Scanner(System.in);
		
		String nome = sc.nextLine();
		
		int idade = sc.nextInt();
		
		Boolean statusDoador = sc.nextBoolean();
		
		sc.close();
		
		if (idade >= 18 && idade < 69) {
			if(idade >= 60 && idade <= 69) {
				if(statusDoador) {
					System.out.printf("%s não está apto/a para doar sangue!", nome);
				} else {
					System.out.printf("%s está apto/a para doar sangue!", nome);
				}
			} else {
				if (!statusDoador) {
					statusDoador = true;
				}
				System.out.printf("%s está apto/a para doar sangue!", nome);
			}
		} else {
			System.out.printf("%s não está apto/a para doar sangue!", nome);
		} 
	}

}
