package exercicios.repeticao;

import java.util.Scanner;
import java.util.InputMismatchException;

/*
6- Faça um programa que leia 10 inteiros e imprima sua média.
*/
public class Ex_rep_06 {

	public static void main(String[] args) {
		Scanner teclado = new Scanner(System.in);
		
		try {
			int i = 1;
			float soma = 0;
			while(i < 11) {
				System.out.println("Insira o " + i + (char)(176) + " número.");
				soma = soma + teclado.nextFloat();
				i++;
			}
			float media = soma / 10;
			System.out.println("A média dos números é " + media);
		}catch(InputMismatchException e) {
			System.out.println("Informe um valor válido.\nOcorreu o seguinte erro: " + e);
		}
		
		teclado.close();
	}

}
