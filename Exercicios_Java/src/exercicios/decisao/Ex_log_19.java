package exercicios.decisao;

import java.util.Scanner;
import java.util.InputMismatchException;

/*
19- Faça um programa para verificar se um determinado número inteiro é divisível por 3
ou 5, mas não simultaneamente pelos dois.
*/



public class Ex_log_19 {
	
	static Scanner teclado = new Scanner(System.in);
	static int num;
	
	public static void main(String[] args) {
		
		try {
			System.out.println("Insira um número inteiro: ");
			num = teclado.nextInt();
			
			if(num % 3 == 0) {
				System.out.println("O número " + num + " é divisível por 3.");
				if(num % 5 == 0) {
					System.out.println("O número " + num + " é divisível por 5.");
				}
			}
			if(num % 5 == 0) {
				System.out.println("O número " + num + " é divisível por 5.");
			}
			System.out.println("O número " + num + " não é divisível por 3 nem por 5.");
		}catch(InputMismatchException e) {
			System.out.println("Informe um número válido!!!" +
					           "\nOcorreu o seguinte erro: " + e);
		}
				
		teclado.close();
	}
}
