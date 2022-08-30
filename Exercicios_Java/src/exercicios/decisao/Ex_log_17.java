package exercicios.decisao;

import java.util.InputMismatchException;
import java.util.Scanner;

/*
Faça um programa que calcule e mostre a área de um trapézio. Sabe-se que:

A = ((basemaior + basemenor) * altura) / 2

Lembre-se, a base maior e a base menor devem ser números maiores que zero.

*/
public class Ex_log_17 {

	public static void main(String[] args) {
		Scanner teclado = new Scanner(System.in);
		
		System.out.println("============ Calculo de Área do Trapézio ============");
		
		try {
		System.out.println("Insira o valor de uma das bases: ");
		float baseMaior = teclado.nextFloat();
		
		System.out.println("Insira o valor da outra base: ");
		float baseMenor = teclado.nextFloat();
		
		System.out.println("Insira o valor da altura: ");
		float altura = teclado.nextFloat();
		
		if(baseMaior > 0 && baseMenor > 0) {
			float res = ((baseMaior + baseMenor) * altura) / 2;
			System.out.println("A área do trapézio é: " + res);
		}else {
			System.out.println("O valor das bases devem ser maior que 0!!!");
		}
		}catch(InputMismatchException e) {
			System.out.println("Digite apenas números.\nOcorreu o seguinte erro: " + e);
		}
		
		teclado.close();
		

	}

}
