package exercicio2;

import java.util.Iterator;
import java.util.Scanner;
import java.util.Stack;

public class Program {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		Stack<String> pilha = new Stack<String>();
		String livro = "";
		
		while(true) {
			System.out.println("1 - Adicionar Livro na pilha.");
			System.out.println("2 - Listar todos os Livros");
			System.out.println("3 - Retirar Livro da pilha");
			System.out.println("0 - Sair");
			
			System.out.print("\nDigite uma opção: ");
			
			int opcao = sc.nextInt();
			
			if(opcao == 0) {
				System.out.println("\nPrograma Finalizado!");
				break;
			} else if(opcao == 1) {
				System.out.print("\nDigite o nome: ");
				sc.nextLine();
				livro = sc.nextLine();
				if(pilha.add(livro)) {
					System.out.println("\nLivro Adicionado!\n");
				}
			} else if(opcao == 2) {
				System.out.println("\nLista de Livros na Pilha:\n");
				Iterator<String> iterator = pilha.iterator();
				while(iterator.hasNext()) {
					System.out.println(iterator.next());
				}
				System.out.println("");
			} else if(opcao == 3) {
				if(!pilha.isEmpty()) {
					pilha.pop();
					System.out.println("\nUm Livro foi retirado da pilha!\n");					
				} else {
					System.out.println("\nA Pilha está vazia!\n");					
				}
			}
		}
	}
}
