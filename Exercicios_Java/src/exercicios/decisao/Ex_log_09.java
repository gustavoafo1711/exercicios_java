package logica.java;

/*
6 - Escreva um programa que, dados dois números inteiros, mostre na tela o maior deles,
assim como a diferença existente entre ambos.
*/

import java.util.Scanner;
import java.util.InputMismatchException;

public class Ex_log_09 {
	public static void main(String[] args) {
		int num1, num2;
		
		Scanner teclado = new Scanner(System.in);
		
		System.out.println("======================== Mostre o Maior Número ========================");
		try {
		System.out.println("Informe o primeiro número: ");
		num1 = teclado.nextInt();
		
		System.out.println("Informe o segundo número: ");
		num2 = teclado.nextInt();
		
		if(num1 > num2) {
			System.out.println("O maior número é: " + num1);
			System.out.println("A diferença dos números é: " + (num1 - num2));
		} else if(num1 == num2){
			System.out.println("Os números são iguais");
		} else {
			System.out.println("O maior número é: " + num2);
			System.out.println("A diferença dos números é: " + (num2 - num1));
		}
		
				
		teclado.close();
		} catch (InputMismatchException err) {
			System.out.println("Informe somente números.\nOcorreu o seguinte erro: " + err);
		}
		
	}

}
