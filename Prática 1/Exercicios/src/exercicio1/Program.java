package exercicio1;

import java.util.Locale;
import java.util.Scanner;

public class Program {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		float salario = sc.nextFloat();
		float abono = sc.nextFloat();
		
		float novoSalario = salario + abono;
		
		System.out.printf("%.2f", novoSalario);
	}

}
