package exercicio1;

import java.util.Iterator;
import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;

public class Program {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		Queue<String> fila = new LinkedList<String>();
		String cliente = "";
		
		while(true) {
			System.out.println("1 - Adicionar Cliente na fila.");
			System.out.println("2 - Listar todos os Clientes");
			System.out.println("3 - Retirar Cliente da Fila");
			System.out.println("0 - Sair");
			
			System.out.print("\nDigite uma opção: ");
			
			int opcao = sc.nextInt();
			
			if(opcao == 0) {
				System.out.println("\nPrograma Finalizado!");
				break;
			} else if(opcao == 1) {
				System.out.print("\nDigite o nome: ");
				cliente = sc.next();
				if(fila.add(cliente)) {
					System.out.println("\nCliente Adicionado\n");
				}
			} else if(opcao == 2) {
				System.out.println("\nLista de Clientes na Fila:\n");
				Iterator<String> iterator = fila.iterator();
				while(iterator.hasNext()) {
					System.out.println(iterator.next());
				}
				System.out.println("");
			} else if(opcao == 3) {
				if(!fila.isEmpty()) {
					fila.remove();
					System.out.println("\nO Cliente foi Chamado!\n");					
				} else {
					System.out.println("\nA Fila está vazia!\n");					
				}
			}
			
		}
		

	}

}
