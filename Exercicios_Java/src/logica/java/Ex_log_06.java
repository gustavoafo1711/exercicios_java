package logica.java;

import java.util.Scanner;

/*
Leia o salário de um trabalhador e o valor da prestação de um empréstimo.
Se a prestação for maior que 20% do salário imprima: 'Empréstimo não concedido',
caso contrário imprima 'Emprestimo concedido'
*/

public class Ex_log_06 {

	public static void main(String[] args) {
		System.out.println("=============== Empréstimo ===============\n");
		
		Scanner teclado = new Scanner(System.in);
		
		System.out.println("Informe o seu salário: ");
		float salario = teclado.nextFloat();
		
		System.out.println("\nInforme o valor da prestação do empréstimo: ");
		float prestacao = teclado.nextFloat();
		
		if (prestacao < salario * 0.2) {
			System.out.println("________________________\nEmpréstimo concedido. :)");
			System.out.println(salario * 0.2);
		} else {
			System.out.println("____________________________\nEmpréstimo não concedido. :(");
			System.out.println(salario * 0.2);
		}
		
		teclado.close();
	}

}
