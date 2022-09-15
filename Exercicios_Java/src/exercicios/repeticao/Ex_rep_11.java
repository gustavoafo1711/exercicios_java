package exercicios.repeticao;

import java.util.InputMismatchException;
import java.util.Scanner;

/*
11- Faça um programa que leia um número inteiro positivo N e imprima todos os
números naturais de 0 até N em ordem crescente.
*/
public class Ex_rep_11 {
	public static void main(String[] args) {
		Scanner teclado = new Scanner(System.in);

		try {
			System.out.println("Insira um número inteiro positivo.");
			int num = teclado.nextInt();

			if (num < 0) {
				System.out.println("Este não é um número válido.");
			} else {
				for (int i = 0; i <= num; i++) {
					System.out.println(i);
				}
			}
		} catch (InputMismatchException e) {
			System.out.println("Informe um número válido.");
		}

		teclado.close();
	}

}
