package exercicios.decisao;

import java.util.Scanner;


/*
11 - Escreva um programa que leia um número inteiro maior do que zero e devolva na tela
a soma de todos os seus algarismos. Por exemplo, ao número 251 corresponderá o valor
8 ( 2+5+1 ). Se o nnúmero lido não for maior do que zero, o programa terminará com a mensagem
'Número inválido'
*/
public class Ex_log_07 {
	public static void main(String[] args) {
		
		Scanner teclado = new Scanner(System.in);
		
		int num = 0;
		int soma = 0;
		
		System.out.println("informe um número inteiro positivo: ");
		num = teclado.nextInt();
		
	
		while(num > 0) {
			//1- obter o módulo do número digitado;
			int modulo = num % 10;
			//2- incrementar o módulo a variável soma;
			soma = soma + modulo;
			//3- dividir o número por 10 e atribuirmos a variável num
			num = num / 10;
		}
		
		System.out.println("A soma dos digitos do número é: " + soma);
		
		teclado.close();
	}
}
