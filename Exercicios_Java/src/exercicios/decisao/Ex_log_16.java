package exercicios.decisao;

import java.util.InputMismatchException;
import java.util.Scanner;

/*
16- Usando switch, escreva um programa que leia um inteiro entre 1 e 12
e imprima o mês correspondente a este número. Isto é, janeiro se 1,
fevereiro se 2 e assim por diate.
*/
public class Ex_log_16 {
	public static void main(String[] args) {
		Scanner teclado = new Scanner(System.in);
		
		try {
			System.out.println("Informe um número entre 1 e 12");
			int mes = teclado.nextInt();
			
			switch (mes) {
			case 1:
				System.out.println("Janeiro");
				break;
			case 2:
				System.out.println("Fevereiro");
				break;
			case 3:
				System.out.println("Março");
				break;
			case 4:
				System.out.println("Abril");
				break;
			case 5:
				System.out.println("Maio");
				break;
			case 6:
				System.out.println("Junho");
				break;
			case 7:
				System.out.println("Julho");
				break;
			case 8:
				System.out.println("Agosto");
				break;
			case 9:
				System.out.println("Setembro");
				break;
			case 10:
				System.out.println("Outubro");
				break;
			case 11:
				System.out.println("Novembro");
				break;
			case 12:
				System.out.println("Dezembro");
				break;
			default:
				System.out.println("Informe um número entre 1 e 12");
				break;
			}
		}catch(InputMismatchException e) {
			System.out.println("Informe um número entre 1 e 12");
		}
	}

}
