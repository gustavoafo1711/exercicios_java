package exercicios.repeticao;

import java.util.InputMismatchException;
import java.util.Scanner;

/*
7- Faça um programa que leia 10 inteiros positivos, ignorando os
não positivos, e imprima sua média.

*/
public class Ex_rep_07 {

	public static void main(String[] args) {
		Scanner teclado = new Scanner(System.in);
		
		int i = 0;
		int soma = 0;
		try {
		while(i < 10) {
			System.out.println("Insira um número interio positivo: ");
			int num = teclado.nextInt();
			
			if(num >= 0) {
				soma = soma + num;
				i++;
			}
		}
		System.out.println("A soma dos números é: " + soma);
		}catch(InputMismatchException e) {
			System.out.println("Insira apenas números inteiros!");
		}
		
		teclado.close();

	}

}
