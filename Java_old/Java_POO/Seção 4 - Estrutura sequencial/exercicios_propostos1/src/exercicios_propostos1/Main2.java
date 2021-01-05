package exercicios_propostos1;

import java.util.Scanner;

public class Main2 {

	public static void main(String[] args) {
		// Ex3: Fazer um programa para ler quatro valores inteiros A, B, C e D. A seguir, calcule e mostre a diferença do produto
		// de A e B pelo produto de C e D segundo a fórmula: DIFERENCA = (A * B - C * D).
		
		Scanner sc = new Scanner(System.in);
		int A,B,C,D;
		A = sc.nextInt();
		B = sc.nextInt();
		C = sc.nextInt();
		D = sc.nextInt();
		int dif = (A * B - C * D);
		System.out.print("DIFERENCA = " + dif);
		sc.close();
	}

}
