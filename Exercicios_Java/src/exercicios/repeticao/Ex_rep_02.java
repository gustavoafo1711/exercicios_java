package exercicios.repeticao;
/*
Escreva um programa que escreva na tela de 1 até 100, de 1 em 1.
Faça usando as estruturas de repetiçã:
for; while; do while;

*/
public class Ex_rep_02 {

	public static void main(String[] args) {
		System.out.println("====== for ======");
		for(int i = 1; i < 101; i++) {
			System.out.println(i);
		}
		
		System.out.println("\n====== while ======");
		int i = 1;
		while(i < 101) {
			System.out.println(i);
			i++;
		}
		
		System.out.println("\n====== do while ======");
		int y = 1;
		do {
			System.out.println(y);
			y++;
		}while (y < 101);

	}

}
