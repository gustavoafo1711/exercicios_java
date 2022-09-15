package exercicios.vetores;

import java.util.Arrays;
import java.util.InputMismatchException;
import java.util.Scanner;

/*
03- Ler um conjunto de números reais, armazenando-o em vetor e calcular
o quadrado dos componentes deste vetor, armazenando o resultado em outro vetor.
Os conjuntos têm 10 elementos cada. Imprimir todos os conjuntos.
*/
public class Ex_vetores_03 {
	
	static Scanner teclado = new Scanner(System.in);
	static int vetor1[] = new int[10];
	static int vetor1Quad[] = new int[10];
	
	public static void main(String[] args) {
		System.out.println("=============== Lista dos Vetores ao Quadrado ===============");

		try {
			for (int i = 0; i < 10; i++) {
				System.out.println("Insira o " + (i + 1) + (char) (176) + " valor: ");
				vetor1[i] = teclado.nextInt();
				vetor1Quad[i] = vetor1[i] * vetor1[i];
				;
			}
			System.out.println("A lista de Array é: " + Arrays.toString(vetor1));
			System.out.println("A lista de Array elevado ao quadrado é: " + Arrays.toString(vetor1Quad));
		} catch (InputMismatchException e) {
			System.out.println("Insira um valor válido.");
		}

	}

}

