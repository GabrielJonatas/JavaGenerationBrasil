package exercicio4;

import java.util.HashSet;
import java.util.Iterator;
import java.util.Scanner;
import java.util.Set;

public class Program {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		Set<Integer> numbers = new HashSet<>();
		boolean found = false;
		
		numbers.add(2);
		numbers.add(5);
		numbers.add(1);
		numbers.add(3);
		numbers.add(4);
		numbers.add(9);
		numbers.add(7);
		numbers.add(8);
		numbers.add(10);
		numbers.add(6);
		
		System.out.print("Digite o número que você deseja encontrar: ");
		int targetNumber = sc.nextInt();
		System.out.println("");

		Iterator<Integer> numberIterators = numbers.iterator();
		
		while(numberIterators.hasNext()) {
			if(numberIterators.next() == targetNumber) {
				System.out.printf("O número %d foi encontrado!", targetNumber);
				found = true;
				break;
			} 
		}
		
		if(!found) {
			System.out.printf("O número %d não foi encontrado!", targetNumber);
		}
	}

}
