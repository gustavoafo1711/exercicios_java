package exercicios.repeticao;

import java.util.InputMismatchException;
import java.util.Scanner;

/*
5- Faça um programa que peça ao usuário para digitar 10 valores e some-os.
*/
public class Ex_rep_05 {

	public static void main(String[] args) {
		Scanner teclado = new Scanner(System.in);
		
		try {
			System.out.println("Informe valores a serem somados.");
			float soma = 0;
			for (int i = 1; i < 11; i++) {
				System.out.println("Informe o " + i + (char) (176) + " valor.");
				soma = soma + teclado.nextFloat();
			}
			System.out.println("A soma dos números é " + soma);

		} catch (InputMismatchException e) {
			System.out.println("Informe um valor válido.");
		}
		
		teclado.close();

	}

}
