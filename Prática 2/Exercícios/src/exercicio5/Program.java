package exercicio5;

import java.util.Locale;
import java.util.Scanner;

public class Program {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		
		Scanner sc = new Scanner(System.in);
		
		System.out.print("Código do Produto: ");
		int codigoDoProduto = sc.nextInt();
		
		System.out.println();
		
		System.out.print("Quantidade: ");
		int quantidade = sc.nextInt();
	
		sc.close();
		
		System.out.println();
		
		switch(codigoDoProduto) {
		  case 1:
			  System.out.println("Produto: Cachorro Quente");
			  System.out.println();
			  System.out.printf("Valor total: R$%.2f", quantidade * 10.00);
			  break;
		  case 2:
			  System.out.println("Produto: X-Salada");
			  System.out.println();
			  System.out.printf("Valor total: R$%.2f", quantidade * 15.00);
			  break;
		  case 3:
			  System.out.println("Produto: X-Bacon");
			  System.out.println();
			  System.out.printf("Valor total: R$%.2f", quantidade * 18.00);
			  break;
		  case 4:
			  System.out.println("Produto: Bauru");
			  System.out.println();
			  System.out.printf("Valor total: R$%.2f", quantidade * 12.00);
			  break;
		  case 5:
			  System.out.println("Produto: Refrigerante");
			  System.out.println();
			  System.out.printf("Valor total: R$%.2f", quantidade * 8.00);
			  break;
		  case 6:
			  System.out.println("Produto: Suco de laranja");
			  System.out.println();
			  System.out.printf("Valor total: R$%.2f", quantidade * 13.00);
			  break;
		  default:
		    System.out.println("");
		}
		
	}

}
