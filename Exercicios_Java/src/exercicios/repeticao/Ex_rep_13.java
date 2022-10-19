package exercicios.repeticao;

import java.util.InputMismatchException;
import java.util.Scanner;
import java.util.concurrent.TimeUnit;

/*
13- Faça um programa que leia um número inteiro positivo par N e imprima
todos os números pares de 0 até N em ordem crescente.
*/


public class Ex_rep_13 {
	
	public static void main(String[] args) throws InterruptedException {
	Scanner teclado = new Scanner(System.in);
	
	System.out.println("Informe um número inteiro positivo: ");
	try {
		int num = teclado.nextInt();
		if (num <= 0) {
			Ex_rep_13.main(args);
		} else {
			int contador = 0;
			while (contador <= num) {
				System.out.println(contador);
				contador = contador + 2;
			}
		}
	} catch (InputMismatchException e) {
		System.out.println("Informe um valor válido.\nOcorreu o seguinte erro: " + e);
		Ex_rep_13.main(args);
	}
	
	teclado.close();
	
	}
}
