package logica.java;

import java.util.Scanner;
import java.util.InputMismatchException;

/*
Leia um número fornecido pelo usuário. Se esse número for positivo, calcule
a raiz quadrada do número. Se o número for negativo, mostre uma mensagem
dizendo que o número é negativo.
*/
public class Ex_log_02 {

	
	public static void main(String[] args) {
		Scanner teclado = new Scanner(System.in);
		
		try {
			System.out.println("Informe um número positivo para o calculo da raiz quadrada: ");
			float num = teclado.nextFloat();
			
			if(num >= 0) {
				float res = (float) Math.sqrt(num);
				System.out.println("A raiz quadrada de " + num + " é: " + res);
			} else {
				System.out.println("O número é negatico!!!");
			}
		} catch(InputMismatchException e) {
			System.out.println("Informe somente números!!!");
		}
		
		teclado.close();

	}

}
