package logica.java;

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
		
		System.out.println("Informe sua altura: ");
		altura = teclado.nextFloat();
		
		System.out.println("Informe seu sexo. 'H' para homem, 'F' para Mulher: ");
		genero = teclado.nextLine();
		
		if(genero == "H") {
			res = (72.7f * altura) - 58;
			System.out.println("Seu peso ideal é: " + res + " kilos");
		} else if(genero == "F") {
			res = (62.1f * altura) - 44.7f;
			System.out.println("Seu peso ideal é: " + res + " kilos");
		} else {
			System.out.println("Informe corretamente seu genero!!!");
		}
				
		teclado.close();
	}
	
}
