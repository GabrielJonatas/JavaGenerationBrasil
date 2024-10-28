package exercicio3;

import java.util.Locale;
import java.util.Scanner;

public class Program {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		float salarioBruto = sc.nextFloat();
		float adicionalNoturno = sc.nextFloat();
		float horasExtras = sc.nextFloat();
		float descontos = sc.nextFloat();
		
		float salarioLiquido = salarioBruto + adicionalNoturno + (horasExtras*5) - descontos;
		
		System.out.printf("Salário Líquido: %.2f", salarioLiquido);

	}

}
