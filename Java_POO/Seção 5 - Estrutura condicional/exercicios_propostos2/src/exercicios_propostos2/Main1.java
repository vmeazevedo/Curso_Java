package exercicios_propostos2;

import java.util.Scanner;

public class Main1 {

	public static void main(String[] args) {
		// Ex2: Fazer um programa para ler um número inteiro e dizer se este número é par ou ímpar.
		Scanner sc = new Scanner(System.in);
		int num = sc.nextInt();
		int ver = num % 2;
		if (ver==0) {
			System.out.println("PAR");
		} else {
			System.out.println("IMPAR");
		}
	sc.close();
	}

}
