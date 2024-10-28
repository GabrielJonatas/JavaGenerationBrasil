package exercicio4;

import java.util.Locale;
import java.util.Scanner;

public class Program {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		float numero1 = sc.nextFloat();
		float numero2 = sc.nextFloat();
		float numero3 = sc.nextFloat();
		float numero4 = sc.nextFloat();
		
		double diferenca = (numero1 * numero2) - (numero3 * numero4);
		
		System.out.printf("Diferença: %.1f", diferenca);
	}

}
