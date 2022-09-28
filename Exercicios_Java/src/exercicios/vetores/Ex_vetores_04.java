package exercicios.vetores;

import java.util.Arrays;
import java.util.InputMismatchException;
import java.util.Scanner;

/*
04- Faça um programa que leia um vetor de 8 posiçõese em seguida ele escolha 2 
valores X e Y quaisquer correspondentes a duas posições no vetor. Ao final seu
programa deverá escrever a soma dos valores encontrados nas respectivas posições X e Y.
 */
public class Ex_vetores_04 {

	static Scanner teclado = new Scanner(System.in);
	static int meuVetor[] = new int[8];
	static int soma = 0;

	public static void main(String[] args) {
		try {
			for (int i = 0; i < meuVetor.length; i++) {
				System.out.println("Insira o " + (i + 1) + (char) (176) + " valor do vetor:");
				meuVetor[i] = teclado.nextInt();
			}

			System.out.println("Seu vetor é: " + Arrays.toString(meuVetor));

			System.out.println("\nSomando números aleatórios do vetor.");
			for (int j = 1; j < 3; j++) {
				int numAleatorio = (int) (Math.random() * 8);
				System.out.println("O " + j + (char) (176) + " número do vetor: " + meuVetor[numAleatorio]);
				soma = soma + meuVetor[numAleatorio];
			}

			System.out.println("A soma dos números sorteados é: " + soma);
		} catch (InputMismatchException e) {
			System.out.println("Informe um valor válido.");
		}
	}

}
