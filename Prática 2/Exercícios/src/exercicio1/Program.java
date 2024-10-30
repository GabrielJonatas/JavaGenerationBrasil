package exercicio1;

import java.util.Locale;
import java.util.Scanner;

public class Program {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		
		Scanner sc = new Scanner(System.in);
		
		int numeroA = sc.nextInt();
		int numeroB = sc.nextInt();
		int numeroC = sc.nextInt();
		
		sc.close();
		
		if ((numeroA + numeroB) > numeroC) {
			System.out.printf("A Soma de A + B é Maior do que C");
		} else if ((numeroA + numeroB) < numeroC) {
			System.out.printf("A Soma de A + B é Menor do que C");
		} else {
			System.out.printf("A Soma de A + B é Igual a C");
		}
	}
}
