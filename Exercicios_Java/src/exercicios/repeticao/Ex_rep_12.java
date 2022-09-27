package exercicios.repeticao;

import java.util.InputMismatchException;
import java.util.Scanner;

/*
12- Faça um programa que leia um número inteiro positivo N e imprima todos os
números naturais de 0 até N em ordem decrescente.
 */
public class Ex_rep_12 {

	public static void main(String[] args) {
		Scanner teclado = new Scanner(System.in);
		int num;
		int res;

		System.out.println("===================== Imprimindo Números Decrescentes ======================");
		
		try {
		System.out.println("\nInforme um número inteiro positivo: ");
		num = teclado.nextInt();
		res = num;
		
		for (int i = 0; i <= num; i++) {
			System.out.print(res + ", ");
			res = res - 1;
		}
		}catch (InputMismatchException e){
			System.out.println("Informe um valor válido.\n" + e );
		}
		teclado.close();
	}

}
