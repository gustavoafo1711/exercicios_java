package exercicios.decisao;

import java.util.Scanner;
import java.util.InputMismatchException;

/*
5 - Faça um programa que receba um número inteiro e verifique se
este número é par ou ímpar.
*/
public class Ex_log_04 {

	public static void main(String[] args) {
		Scanner teclado = new Scanner(System.in);
		
		try {
			System.out.println("Informe um número inteiro: ");
			int num = teclado.nextInt();
			
			if(num % 2 == 0) {
				System.out.println("O número " + num + " é par");
			} else {
				System.out.println("O número " + num + " é ímpar");
			}
		} catch(InputMismatchException e) {
			System.out.println("Informe um número inteiro!!!\nOcorreu o seguinte erro: " + e);
		}
		teclado.close();
	}

}
