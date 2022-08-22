package exercicios.decisao;

import java.util.InputMismatchException;
import java.util.Scanner;

/*
Ler um número inteiro. Se o número for negativo, escreva a mensagem
"Número inválido. Se o número for positivo, calcular o logaritmo deste numero.


 */
public class Ex_log_12 {

	public static void main(String[] args) {
				
		Scanner teclado = new Scanner(System.in);
		
		System.out.println("Informe um número inteiro positivo.");
		try {
			int num = teclado.nextInt();
			
			if(num > 0) {
				System.out.println(Math.log10(num));
			}else {
				System.out.println("Número inválido");
			}
		}catch(InputMismatchException e) {
			System.out.println("Ocorreu o seguinte erro: " + e);
		}
		

	}

}
