package exercicios_propostos2;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		// Ex1: Fazer um programa para ler um n�mero inteiro, e depois dizer se este n�mero � negativo ou n�o.
		
		Scanner sc = new Scanner(System.in);
		int num = sc.nextInt();
		if (num<0) {
			System.out.println("NEGATIVO");
		} else {
			System.out.println("NAO NEGATIVO");
		}
		sc.close();
	}

}
