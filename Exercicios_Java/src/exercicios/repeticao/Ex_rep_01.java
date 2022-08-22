package exercicios.repeticao;
/*
1- Faça um programa que determine e mostre os cinco primeiros múltiplos de 3
considerando números maiores que 0. 
 
*/

public class Ex_rep_01 {

	public static void main(String[] args) {
		System.out.println("====== For ======");
		int contador = 1;
		for(int i = 0; i < 5; i++) {
			System.out.println(contador * 3);
			contador += 1;
		}
		
		System.out.println();
		System.out.println("====== While ======");
		
		int cont = 1;
		while(cont <= 5) {
			System.out.println(cont * 3);
			cont += 1;
		}

	}

}
