package exercicio1;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Program {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		List<String> cores = new ArrayList<>();
		
		for(int i=0; i<5; i++) {
			System.out.print("Digite uma cor: ");
			cores.add(sc.next());
			System.out.println("");
		}

		System.out.println("Listar todas as cores:");
		System.out.println("");
		
		for (String cor: cores) {
			System.out.println(cor);			
		}
		
		System.out.println("");
		System.out.println("Ordenar as cores:");
		System.out.println("");
		
		cores.sort(null);
		
		for (String cor: cores) {
			System.out.println(cor);			
		}
	}

}
