package exercicios.vetores;
/*
01- Faça um programa que possua um vetor denominado A que armazene 6
númeors inteiros. O programa deve executar os seguintes passos:
a) Atribua os seguintes valores a esse vetor: 1, 0, 5, -2, -5, 7.
b) Armazene em uma variável inteira simples a soma entre os valores 
das posições A[0], A[1] e A[5] do vetor e mostre na tela esta soma.
c)Modifique o vetor na posição 4, atribuindo a esta posição o valor 100.
d) Mostre na tela cada valor do vetor A, um em cada linha.

*/
public class Ex_vetores_01 {

	public static void main(String[] args) {
		//a) Atribua os seguintes valores a esse vetor: 1, 0, 5, -2, -5, 7.
		int num[] = {1, 0, 5, -2, -5, 7};
				
		//b) Armazene em uma variável inteira simples a soma entre os valores 
		//das posições A[0], A[1] e A[5] do vetor e mostre na tela esta soma.
		int soma = num[0] + num[1] + num[5];
		System.out.println("A soma das posições somaA [0], A[1] e A[5] é: " + soma);
		
		//c)Modifique o vetor na posição 4, atribuindo a esta posição o valor 100.
		num[4] = 100;
		System.out.println("\nO novo valor de num[4] é: " + num[4]);
		
		//d) Mostre na tela cada valor do vetor A, um em cada linha.
		System.out.println("");
		for(int i = 0; i < num.length; i++) {
			System.out.println("O valor da posição num[" + i + "] é: " + num[i]);
		}
		
	}

}
