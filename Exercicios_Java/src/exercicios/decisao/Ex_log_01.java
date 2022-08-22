package logica.java;

import java.util.InputMismatchException;
import java.util.Scanner;

//1 - Faça um programa que receba dois números e mostre quel deles é o maior.
public class Ex_log_01 {

	public static void main(String[] args) {
		Scanner teclado = new Scanner(System.in);
		try {
			System.out.println("Informe um número inteiro: ");
			int num1 = teclado.nextInt();
			
			System.out.println("Informe outro número inteiro: ");
			int num2 = teclado.nextInt();
			
			if(num1 > num2) {
				System.out.println("\nO número " + num1 + " é maior que " + num2);
			} else {
				System.out.println("\nO número " + num2 + " é maior que " + num1);
			}
		} catch (InputMismatchException e) {
			System.out.println("\nOcorreu o seguinte erro: " + e);
		}
		
		teclado.close();
	}

}
