package logica.java;

import java.util.InputMismatchException;
import java.util.Scanner;
/*
Leia um número real. se o número for positivo imprima a raiz quadrada, do 
contrário imprima o número ao quadrado.
*/
public class Ex_log_03 {
	public static void main(String[] args) {
		Scanner teclado = new Scanner(System.in);
		
		try {
			System.out.println("Informe um número: ");
			int num = teclado.nextInt();
			
			if(num >= 0) {
				float res = (float) Math.sqrt(num);
				System.out.println("\nA raiz quadrada de " + num + " é: " + res);
			} else {
				float res = (float) Math.pow(num, 2);
				System.out.println("\nO número " + num + " elevado ao quadrado é: " + res);
			}
		} catch (InputMismatchException e){
			System.out.println("Informe somente números reais!!!");
		}
		teclado.close();
	}

}
