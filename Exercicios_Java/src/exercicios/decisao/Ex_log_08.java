package exercicios.decisao;

import java.util.Scanner;
import java.util.InputMismatchException;

/*
4 - Faça um programa que leia um número e caso ele seja positivo, calcule e mostre:
- O número digitado ao quadrado;
- A raiz quadrada do número;
*/

public class Ex_log_08 {

	public static void main(String[] args) {
		
		float num;
		
		Scanner teclado = new Scanner(System.in);
		
		try {
			System.out.println("Informe um número positivo: ");
			num = teclado.nextFloat();
			
			if(num > 0) {
				System.out.println("O número " + num + " ao quadrado é: " + Math.pow(num, 2));
				System.out.println("A raiz quadrada do número " + num + " é: " + Math.sqrt(num));
			} else {
				System.out.println("Informe um número positivo.");
			}
		} catch (InputMismatchException err) {
			System.out.println("Informe somente números.\nOcorreu o seguinte erro: " + err);
		}
		
		teclado.close();
	}

}
