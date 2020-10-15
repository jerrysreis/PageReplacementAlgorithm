package principal;

import java.util.ArrayList;
import java.util.InputMismatchException;
import java.util.Scanner;

public class PageReplacement {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		ArrayList<Integer> queue = new ArrayList<>(4);
		int valor = 0;
		boolean temValor = false;


		for(int i = 0; i < 15; i++) {

			System.out.print("Digite um valor para ser adicionado a lista: ");

			do {

				try {

					valor = scan.nextInt();
					temValor = true;

				} catch (InputMismatchException e) {

					System.out.println("Digite um valor válido");
					temValor = false;
					scan.next();

				}

			}while(!temValor);

			System.out.print(" - Adicionando " + valor);

			if(queue.size() == 4) {

				System.out.println(" e removendo " + queue.get(0));
				queue.remove(0);

			}
			queue.add(valor);

			System.out.println("\n\n*********************************************************************");
			System.out.println("Resultado = " + queue);
			System.out.println("*********************************************************************\n\n");


		}

	}

}


