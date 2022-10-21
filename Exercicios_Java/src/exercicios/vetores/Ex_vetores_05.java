package exercicios.vetores;

import java.util.InputMismatchException;

/*
05- Leia um vetor de 10 posições. Contar e ecrever quantos valores pares ele possui.
*/

import java.util.Scanner;

public class Ex_vetores_05 {

	static Scanner teclado = new Scanner(System.in);
		
	static int meuVetor [] = new int [10];
	
	public static void main(String[] args) {
		System.out.println("==================== Contando os quantos números pares ====================");
		
		try {
			for (int i = 0; i < meuVetor.length; i++) {
				System.out.println("Informe o " + (i + 1) + (char) (176) + " número inteiro:");
				meuVetor[i] = teclado.nextInt();
			}

			System.out.println("\nResultado\n########################################");

			for (int j = 0; j < meuVetor.length; j++) {
				if (meuVetor[j] % 2 == 0) {
					System.out.println("Posição " + j + " do vetor é um número par: " + meuVetor[j]);
				}
			}
		} catch (InputMismatchException e) {
			System.out.println("Este não é um valor válido");
		}
	}

}
