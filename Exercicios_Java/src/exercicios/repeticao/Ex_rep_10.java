package exercicios.repeticao;
/*
10- Faça um programa que calcule e mostre a soma dos 50 primeiros números pares.
*/
public class Ex_rep_10 {

	public static void main(String[] args) {
		int soma = 0;
		for (int i = 1; i <= 100; i++) {
			if (i % 2 == 0) {
				soma = soma + i;
			}
		}

		System.out.println("A soma dos primeiros 50 números pares é: " + soma);
	}

}
