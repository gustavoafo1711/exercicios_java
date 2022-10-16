package exercicios.decisao;

import java.util.InputMismatchException;
import java.util.Scanner;

/*
22- Leia a idade e o tempo de serviço de um trabalhador e escreva se ele pode ou não 
se aposentar. As condições para aposentadoria são:
-Ter pelo menos 65 anos
-Ou ter trabalhado pelo menos 30anos
-Ou ter pelo menos 60 anos e trabalhado pelo menos 25 anos
*/
public class Ex_log_22 {
	static Scanner teclado = new Scanner(System.in);

	static int idade;
	static int temp_serv;

	public static void main(String[] args) {
		System.out.println("=============== Calculo de Aposentadoria ===============\n");

		try {
			System.out.println("Informe a sua idade: ");
			idade = teclado.nextInt();
			System.out.println("Informe seu tempo de serviço: ");
			temp_serv = teclado.nextInt();

			if (idade >= 65 || temp_serv >= 30) {
				System.out.println("Você já pode se aposentar.");
			} else {
				System.out.println("Você não está apto a se aposentar.");
			}
			if (idade >= 60 && temp_serv >= 25) {
				System.out.println("Você já pode se aposentar.");
			} else {
				System.out.println("Você não está apto a se aposentar.");
			}
		} catch (InputMismatchException e) {
			System.out.println("Insira um valor váido.");
		}
	}

}
