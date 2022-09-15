package exercicios.matrizes;

import java.util.Scanner;
import java.util.Arrays;
import java.util.InputMismatchException;

/*
01- Leia uma matriz 4x4, conte e escreva quantos valores maiores que 10 ela possui.
*/
public class Ex_matrizes_01 {
	static Scanner teclado = new Scanner(System.in);
	static int matriz[][] = new int[4][4];

	public static void main(String[] args) {
		System.out.println("=============== Matrizes ===============");

		try {
			for (int i = 0; i < matriz.length; i++) {
				for (int j = 0; j < matriz[i].length; j++) {
					System.out.println("Insira um valor para a matriz: ");
					matriz[i][j] = teclado.nextInt();
				}
			}
			
			System.out.println("lista da matriz digitada");
			System.out.println(Arrays.deepToString(matriz));

			for (int i = 0; i < matriz.length; i++) {
				for (int j = 0; j < matriz[i].length; j++) {
					if (matriz[i][j] > 10) {
						System.out.println("Posição [" + i + "][" + j + "] = " + matriz[i][j]);
					}
				}
			}

		} catch (InputMismatchException e) {
			System.out.println("Informe um valor válido.");
		}

	}
}
