package exercicio3;

import java.util.HashSet;
import java.util.Iterator;
import java.util.Scanner;
import java.util.Set;

public class Program {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		Set<Integer> numeros = new HashSet<>();
		
		for(int i=0; i<10; i++) {
			System.out.print("Digite um número inteiro não repetido: ");
			numeros.add(sc.nextInt());
			System.out.println("");
		}

		System.out.println("Listar dados do Set:");
		System.out.println("");
		
		Iterator<Integer> iteradorNumeros = numeros.iterator();
		
		while(iteradorNumeros.hasNext()) {
			System.out.println(iteradorNumeros.next());
		}
	}

}
