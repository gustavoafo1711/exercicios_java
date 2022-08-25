package exercicios.decisao;

import java.util.InputMismatchException;
import java.util.Scanner;

/*
13- Faça um algoritmo que calcule a média ponderada das notas de 3 provas.
A primeira e a segunda prova tem peso 1 e a terceira tem peso 2. Ao final,
mostrar a média do aluno e indicar se o aluno foi aprovado ou reprovado.
A nota para aprovação deve ser igual ou superior a 6 pontos.

 */
public class Ex_log_13 {
	public static void main(String[] args) {
		Scanner teclado = new Scanner(System.in);

		try {
			System.out.println("Insira a primeira nota: ");
			int nota1 = teclado.nextInt();

			System.out.println("Insira a segunda nota: ");
			int nota2 = teclado.nextInt();

			System.out.println("Insira a terceira nota: ");
			int nota3 = teclado.nextInt() * 2;

			float media = (nota1 + nota2 + nota3) / 4;
			if (media >= 6) {
				System.out.println("A média do aluno foi: " + media);
				System.out.println("Aluno aprovado!!! :)");
			} else {
				System.out.println("A média do aluno foi: " + media);
				System.out.println("Aluno reprovado!!! :(");
			}
		} catch (InputMismatchException e) {
			System.out.println("Ocorreu o seguinte erro: " + e);
		}

		teclado.close();
		
		
	}
}
