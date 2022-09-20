package exercicios.decisao;

import java.util.Scanner;
import java.util.InputMismatchException;

/*
21- Escreva o menu  de opções abaixo. Leia o opção do usuário e execute a operação
escolhida. Escreva uma mensagem de erro se a opção for inválida.

Escolha a opção:
1- Soma de 2 números.
2- Diferença entre 2 números (maior pelo menor).
3- Produto entre 2 números.
4- Divisão entre 2 números (o denominador não pode ser zero).
Opção: 

*/
public class Ex_log_21 {
	static Scanner teclado = new Scanner(System.in);
	static float num1;
	static float num2;
	static float result;
	static int opcao;

	public static void main(String[] args) {
		Ex_log_21.menu();
	}

	public static void menu() {

		System.out.println("==================== Calcular ====================\n");

		try {
			System.out.println("Escolha a opção:\n" + "1- Soma de 2 números.\n"
					+ "2- Diferença entre 2 números (maior pelo menor).\n" + "3- Produto entre 2 números.\n"
					+ "4- Divisão entre 2 números (o denominador não pode ser zero).\n" + "Opção: ");
			opcao = teclado.nextInt();

			switch (opcao) {
			case 1:
				somar();
				break;
			case 2:
				subtrair();
				break;
			case 3:
				multiplicar();
				break;
			case 4:
				dividir();
				break;

			default:
				System.out.println("Escolha uma opção válida.\n");
				Ex_log_21.menu();
				break;
			}
		} catch (InputMismatchException e) {
			System.out.println("Operação inválida!!!");
		}
	}

	public static void somar() {
		System.out.println("Informe o primeiro número: ");
		num1 = teclado.nextFloat();
		System.out.println("Informe o segundo número: ");
		num2 = teclado.nextFloat();
		result = num1 + num2;
		System.out.println("A soma dos números é: " + result);
	}

	public static void subtrair() {
		System.out.println("Informe o primeiro número: ");
		num1 = teclado.nextFloat();
		System.out.println("Informe o segundo número: ");
		num2 = teclado.nextFloat();

		if (num1 > num2) {
			result = num1 - num2;
			System.out.println("A diferença do maior número pelo menor número é: " + result);
		} else {
			result = num2 - num1;
			System.out.println("A diferença do maior número pelo menor número é: " + result);
		}
	}

	public static void multiplicar() {
		System.out.println("Informe o primeiro número: ");
		num1 = teclado.nextFloat();
		System.out.println("Informe o segundo número: ");
		num2 = teclado.nextFloat();
		result = num1 * num2;
		System.out.println("A multiplicação dos números é: " + result);
	}

	public static void dividir() {
		System.out.println("Informe o numerador: ");
		num1 = teclado.nextFloat();
		System.out.println("Informe o denominador (não pode ser zero): ");
		num2 = teclado.nextFloat();

		if (num2 == 0) {
			System.out.println("Operação inválida. Divisão por zero!");
		} else {
			result = num1 / num2;
			System.out.println("A divisão dos números é: " + result);
		}
	}

}
