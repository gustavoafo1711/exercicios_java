package exercicios.decisao;

import java.util.Scanner;
import java.util.InputMismatchException;

/*
8 - Faça um programa que leia 2 notas de um aluno, verifique se as notas são válidas e
exiba na tela a média destas notas. Uma nota válida deve ser obrigatoriamente um
valor entre 0.0 e 10.0, onde caso a nota não possua um valor válido, este fato deve 
ser informado ao usuário e o programa termina.
*/
public class Ex_log_05 {

	public static void main(String[] args) {
		Scanner teclado = new Scanner(System.in);
		
		try {
			System.out.println("Informe a primeira nota: ");
			float nota1 = teclado.nextFloat();
			if (0.0 <= nota1 && nota1 <= 10.0) {
				System.out.println("Informe a segunda nota: ");
				float nota2 = teclado.nextFloat();
				
				if (nota2 >= 0 && nota2 <=10) {
					float media = (nota1 + nota2) /2;
					System.out.println("\nA média do aluno é: " + media);
				} else {
					System.out.println("Esse não é um valor válido.");
				}
				
			} else {
				System.out.println("Esse não é um valor válido.");
			}
						
		} catch (InputMismatchException e) {
			System.out.println("Esse não é um valor válido: " + e);
		}

		
		teclado.close();
	}

}
