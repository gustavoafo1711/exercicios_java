package exercicios.repeticao;
/*
3- Faça um algoritmo utilizando o comando while que mostre uma contagem
regressiva na tela, iniciando em 10 e terminando em 0. Mostrar uma
mensagem "FIM" após a contagem.

*/

public class Ex_rep_03 {

	public static void main(String[] args) {
		int i = 10;
		while (i >= 0) {
			System.out.println(i);
			i--;
		}
		System.out.println("FIM");
	}

}
