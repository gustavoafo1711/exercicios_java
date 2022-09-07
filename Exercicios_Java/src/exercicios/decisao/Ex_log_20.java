package exercicios.decisao;

import java.util.InputMismatchException;
import java.util.Scanner;

/*
20- Dados três valores, A, B, C, verificar se eles podem ser valores dos laods de um triângulo e 
se forem, se é um triangulo escaleno, equilátero ou isósceles, considerando os seguintes conceitos:
- O comprimento de cada lado de um triângulo é menor do que a soma dos outros dois lados.
- Chama-se equilátero o triângulo que tem três lados iguais.
- Denominam-se isóscels o triângulo que tem o comprimento de dois lados iguais.
- Recebe-se o nome de escaleno o triângulo que tem os três laods diferentes.


*/
public class Ex_log_20 {
	
	static Scanner teclado = new Scanner(System.in);
	static int ladoA;
	static int ladoB;
	static int ladoC;
	
	public static void main(String[] args) {
		System.out.println("============ Verifique o Tipo do Triângulo ===============");
		Ex_log_20.verificaTriangulo();
	}
	
	static void verificaTriangulo() {
		try {
			System.out.println("Informe o tamanho do lado A: ");
			ladoA = teclado.nextInt();
			System.out.println("Informe o tamanho do lado B: ");
			ladoB = teclado.nextInt();
			System.out.println("Informe o tamanho do lado C: ");
			ladoC = teclado.nextInt();

			if (ladoA < (ladoB + ladoC)) {
				tipoTriangulo();
			} else if (ladoB < (ladoA + ladoC)) {
				tipoTriangulo();
			} else if (ladoC < (ladoA + ladoB)) {
				tipoTriangulo();
			} else {
				System.out.println("Medidas dos lados inválidos");
			}
		} catch (InputMismatchException e) {
			System.out.println("Insira um valor válido!!!");
		}
	}
	
	static void tipoTriangulo() {
		if((ladoA == ladoB) && (ladoA == ladoC)) {
			System.out.println("Este é um triângulo equilátero.");
		}else if((ladoA == ladoB) && ladoA != ladoC) {
			System.out.println("Este é um triangulo isósceles.");
		}else if((ladoA == ladoC) && ladoA != ladoB) {
			System.out.println("Este é um triangulo isósceles.");
		}else if((ladoB == ladoC) && ladoA != ladoB) {
			System.out.println("Este é um triangulo isósceles.");
		}else if((ladoA != ladoB) && (ladoB != ladoC)){
			System.out.println("Este é um triangulo escaleno.");
		}else {
			System.out.println("Não reconhecemos este tipo de triângulo!!!");
		}
		
	}
	
	

}
