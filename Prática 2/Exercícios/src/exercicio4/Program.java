package exercicio4;

import java.util.Locale;
import java.util.Scanner;

public class Program {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		
		Scanner sc = new Scanner(System.in);
		
		String caracteristica1 = sc.next();
		String caracteristica2 = sc.next();
		String caracteristica3 = sc.next();
		
		sc.close();
		
		if (caracteristica1.equalsIgnoreCase("Vertebrado")) {
			if(caracteristica2.equalsIgnoreCase("Ave")) {
				if(caracteristica3.equalsIgnoreCase("Carnívoro")) {
					System.out.print("Águia");
				} else if(caracteristica3.equalsIgnoreCase("Onívoro")) {
					System.out.print("Pomba");
				}
			} else if(caracteristica2.equalsIgnoreCase("Mamífero")) {
				if(caracteristica3.equalsIgnoreCase("Onívoro")) {
					System.out.print("Homem");
				} else if(caracteristica3.equalsIgnoreCase("Herbívoro")) {
					System.out.print("Vaca");
				}
			}
		} else if(caracteristica1.equalsIgnoreCase("Invertebrado")) {
			if(caracteristica2.equalsIgnoreCase("Inseto")) {
				if(caracteristica3.equalsIgnoreCase("Hermatófago")) {
					System.out.print("Pulga");
				} else if(caracteristica3.equalsIgnoreCase("Herbívoro")) {
					System.out.print("Lagarta");
				}
			} else if(caracteristica2.equalsIgnoreCase("Anelídeo")) {
				if(caracteristica3.equalsIgnoreCase("Hermatófago")) {
					System.out.print("Sanguessuga");
				} else if(caracteristica3.equalsIgnoreCase("Onívoro")) {
					System.out.print("Minhoca");
				}
			}
		} 
	}

}
