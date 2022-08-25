package exercicios.repeticao;
/*
Escreva um programa que declare um inteiro, inicializa-o com 0, e 
incremednte-o de 1000 em 1000, imprimindo seu valor na tela, até 
que seu valor seja 100.000 (cem mil).

*/
public class Ex_rep_04 {

	public static void main(String[] args) {
		for(int i = 0; i <= 100000; i += 1000) {
			System.out.println(i);
		}

	}

}
