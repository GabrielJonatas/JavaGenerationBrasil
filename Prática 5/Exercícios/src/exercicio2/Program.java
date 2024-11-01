package exercicio2;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Program {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		List<Integer> numbers = new ArrayList<>();

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
		
		if (numbers.contains(targetNumber)) {
			System.out.printf("O número %d está localizado na posição: %d",targetNumber,numbers.indexOf(targetNumber));	
		} else {
			System.out.printf("O número %d não foi encontrado!",targetNumber);				
		}
	}

}
