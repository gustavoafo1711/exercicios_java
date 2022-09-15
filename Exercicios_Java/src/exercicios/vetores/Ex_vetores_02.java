package exercicios.vetores;

import java.util.Arrays;
import java.util.InputMismatchException;
import java.util.Scanner;

/*
02- Crie um programa que leia 6 valores inteiros e em seguida, mostre na tela os 
valores lidos.
*/
public class Ex_vetores_02 {

	static Scanner teclado = new Scanner(System.in);
	static int meuVetor[] = new int[6];

	public static void main(String[] args) {
		System.out.println("=============== Lista dos seus Valores ===============");

		try {
			for (int i = 0; i < 6; i++) {
				System.out.println("Insira o " + (i + 1) + (char) (176) + " valor: ");
				meuVetor[i] = teclado.nextInt();
				;
			}
			System.out.println("A lista de Array é: " + Arrays.toString(meuVetor));
		} catch (InputMismatchException e) {
			System.out.println("Insira um valor válido.");
		}

	}

}
