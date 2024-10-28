package exercicio2;

import java.util.Locale;
import java.util.Scanner;

public class Program {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		float nota1 = sc.nextFloat();
		float nota2 = sc.nextFloat();
		float nota3 = sc.nextFloat();
		float nota4 = sc.nextFloat();
		
		double media = (nota1 + nota2 + nota3 + nota4)/4.0;
		
		System.out.printf("Média final: %.1f", media);
	}

}
