package exercicios.decisao;

import java.util.InputMismatchException;
import java.util.Scanner;

/*
15- Usando switch, escreva um programa que leia um interio entre 1 e 7 e imprima o dia
da semana correspondente a este número. Isto é, domingo se 1, segunda se 2, e assim
por diante.
*/
public class Ex_log_15 {

	public static void main(String[] args) {
		Scanner teclado = new Scanner(System.in);
		
		try {
			System.out.println("Informe um número entre 1 e 7: ");
			int num = teclado.nextInt();
			switch (num) {
			case 1:
				System.out.println("Domingo");
				break;
			case 2:
				System.out.println("Segunda-feira");
				break;
			case 3:
				System.out.println("Terça-feira");
				break;
			case 4:
				System.out.println("Quarta-feira");
				break;
			case 5:
				System.out.println("Quinta-feira");
				break;
			case 6:
				System.out.println("Sexta-feira");
				break;
			case 7:
				System.out.println("Sábado");
				break;
			default:
				System.out.println("Informe um número entre 1 e 7!!!");
				break;
			}
		} catch (InputMismatchException e) {
			System.out.println("Informe um dos valores que lhe foi pedido");
		}

	}

}
