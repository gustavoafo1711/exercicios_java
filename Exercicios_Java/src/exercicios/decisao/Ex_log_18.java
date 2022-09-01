package exercicios.decisao;

import java.util.Scanner;
import java.util.InputMismatchException;
import java.lang.ArithmeticException;


/*
18- Faça um programa que mostre ao usuário um menu com 4 opções de operações matemáticas.
O usuário escolhe uma das opções e o seu programa então pede dois valores
numéricos e realiza a operação, mostrando o resultado e saindo.
*/
public class Ex_log_18 {

	static Scanner teclado = new Scanner(System.in);
	
	public static void main(String[] args) {
		Ex_log_18.calcular();
	}
	
	public static void calcular() {
		System.out.println("=============== Calculadora ===============");
		
		try {
			System.out.println("\nEscolha uma das operações matemáticas." + "\nSoma [1]: " + " Subtração [2]: "
					+ " Multiplicação [3]: " + " Divisão [4]: ");
			int op = teclado.nextInt();

			System.out.println("Informe um número: ");
			float num1 = teclado.nextFloat();

			System.out.println("Informe o segundo número: ");
			float num2 = teclado.nextFloat();

			if (op == 1) {
				float resSoma = num1 + num2;
				System.out.println("O resultado da soma é: " + resSoma);
			} else if (op == 2) {
				float resSubtracao = num1 - num2;
				System.out.println("O resultado da subtração é: " + resSubtracao);
			} else if (op == 3) {
				float resMultiplicacao = num1 * num2;
				System.out.println("O resultado da multiplicação é: " + resMultiplicacao);
			} else if (op == 4) {
				if(num2 > 0) {
					float resDivisao = num1 / num2;
					System.out.println("O resultado da divisão é: " + resDivisao);
				}else {
					System.out.println("Erro de divisão por 0.");
					Ex_log_18.calcular();
				}
			} else {
				System.out.println("Operação matemática desconhecida!");
			}
		} catch (ArithmeticException eA) {
			System.out.println("Erro de divisão por 0.");
		} catch (InputMismatchException eI) {
			System.out.println("Informe um número válido.");
		
		}

		
	}
}

