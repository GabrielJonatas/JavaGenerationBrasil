package exercicio2;

import java.util.Locale;
import java.util.Scanner;

public class Program {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		
		Scanner sc = new Scanner(System.in);
		
		int numero = sc.nextInt();
		
		sc.close();
		
		if (numero%2 == 0) {
			if (numero > 0) {
				System.out.printf("O Número %d é par e positivo!", numero);
			}else if (numero < 0) {
				System.out.printf("O Número %d é par e negativo!", numero);
			}
		} else {
			if (numero > 0) {
				System.out.printf("O Número %d é ímpar e positivo!", numero);
			}else if (numero < 0) {
				System.out.printf("O Número %d é ímpar e negativo!", numero);
			}
		} 
	}

}
