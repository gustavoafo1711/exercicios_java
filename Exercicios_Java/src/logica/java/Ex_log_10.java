package logica.java;

import java.util.InputMismatchException;

/*
10 - Faça um programa que receba a altura e o sexo de uma pessoa e calcule e mostre
seu peso ideal, utilizando as seguintes fórmulas (onde h corresponde à altura):
Homens: (72,7 * h) - 58;
Mulheres: (62,1 * h) - 44,7
*/

import java.util.Scanner;

public class Ex_log_10 {

	public static void main(String[] args) {
		String genero;
		float altura;
		float res;
		
		Scanner teclado = new Scanner(System.in);
		
		System.out.println("==================== PESO IDEAL ====================\n");
		
		try {
			System.out.println("Informe seu genero. 'H' para homem, 'F' para Mulher: ");
			genero = (String) teclado.nextLine();
			System.out.println("Informe sua altura: ");
			altura = Float.parseFloat(teclado.nextLine()); 

			
			switch(genero) {
			case "H":
				res = (72.7f * altura) - 58;
				System.out.println("Seu peso ideal é: " + res + " kilos");
				break;
			case "F":
				res = (62.1f * altura) - 44.7f;
				System.out.println("Seu peso ideal é: " + res + " kilos");
				break;
			default:
				System.out.println("Informe corretamente seu genero!!!");
			}	
		}catch(InputMismatchException e) {
			System.out.println("Informe um valor válido.");
		}
				
		teclado.close();
		
	//	System.out.println("Informe sua idade: ");
		// idade = teclado.nextInt(); //Bug
	//	idade = Integer.parseInt(teclado.nextLine());
	}
	
}
