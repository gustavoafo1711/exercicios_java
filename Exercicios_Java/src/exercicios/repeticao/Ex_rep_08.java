package exercicios.repeticao;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
import java.util.InputMismatchException;

/*
08- Escreva um programa que leia 10 números e escreva o menor valor
lido e o maior valor lido.
*/
public class Ex_rep_08 {

	public static void main(String[] args) {

		Scanner teclado = new Scanner(System.in);

		try {
			List<Float> lista = new ArrayList<Float>();

			float num;
			int i;
			for (i = 0; i < 10; i++) {
				System.out.println("Informe um número");
				num = teclado.nextFloat();
				lista.add(num);
			}

			lista.sort((n1, n2) -> {
				if (n1 < n2) {
					return -1;
				}
				if (n1 > n2) {
					return 1;
				}
				return 0;
			});

			lista.forEach(n -> System.out.println(n));

			System.out.println("O menor número digitado foi: " + lista.get(0));

			System.out.println("O maior número digitado foi: " + lista.get(i - 1));
		} catch (InputMismatchException e) {
			System.out.println("Informe um valor válido.\nOcorreu o seguinte erro: " + e);
		}

		teclado.close();
	}

}
