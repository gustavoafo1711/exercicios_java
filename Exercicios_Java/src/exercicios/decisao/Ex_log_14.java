package exercicios.decisao;

import java.util.InputMismatchException;
import java.util.Scanner;

/*
14- A nota final de um estudante é calculada a partir de três notas
atribuídas entre o intervalo de 0 até 10, respectivamente, a um trabalho de 
laboratório, a uma avaliação semestral e a um exame final. A média das
três notas mencionadas anteriormente obedece aos pesos:
Trabalho de laboratório: 2;
Avaliação semestral: 3;
Exame final: 5;
De acordo com o resultado, mostre na tela se o aluno está reprovado(média 0 à 2,9),
de recuperação (entre 3 e 4,9), ou se foi aprovado. Faça todas as verificações
necessárias.

*/
public class Ex_log_14 {

	public static void main(String[] args) {
		Scanner teclado = new Scanner(System.in);
		
		try {
			System.out.println("Insira a nota do Trabalho de Laboratório: ");

			float notaLab = teclado.nextFloat() * 2;

			System.out.println("Insira a nota da Avaliação Semestral: ");
			float notaSem = teclado.nextFloat() * 3;

			System.out.println("Insira a nota do Exame Final: ");
			float notaExam = teclado.nextFloat() * 5;

			float media = (notaLab + notaSem + notaExam) / 10;

			if ((media >= 0.0f) && (media < 3.0f)) {
				System.out.println("Aluno reprovado, sua média é: " + media);
			} else if ((media >= 3.0f) && (media < 5.0f)) {
				System.out.println("Aluno de recuperação, sua média é: " + media);
			} else {
				System.out.println("Aluno aprovado, sua média é: " + media);
			}
		} catch (InputMismatchException e) {
			System.out.println("insira um valor válido.");
		}
		
		teclado.close();

	}

}
