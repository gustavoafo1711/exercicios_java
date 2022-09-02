package exercicios.repeticao;

import java.util.InputMismatchException;
import java.util.Scanner;

/*
09- Faça um programa que leia um número interio N e depois imprima os N
primeiros números naturais ímpares.
*/
public class Ex_rep_09 {

	static Scanner teclado = new Scanner(System.in);
	static int num;

	public static void main(String[] args) {
		Ex_rep_09.imprimir();
	}

	public static void imprimir() {

		try {
			System.out.println("Insira um número interio maior que 0: ");
			num = teclado.nextInt();
			int i = 0;
			int cont = 1;

			if (num > 0) {
				while (i < num) {
					System.out.println(cont);
					cont += 2;
					i++;
				}
			} else {
				System.out.println("Informe um número inteiro maior que 0!!!\n");
				Ex_rep_09.imprimir();
			}
		} catch (InputMismatchException e) {
			System.out.println("Informe um número válido");
		}
		

	}

}
