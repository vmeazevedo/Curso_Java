package exercicios_propostos2;

import java.util.Scanner;

public class Main2 {

	public static void main(String[] args) {
		// Ex3: Leia 2 valores inteiros (A e B). Ap�s, o programa deve mostrar uma mensagem "Sao Multiplos" ou "Nao sao
		// Multiplos", indicando se os valores lidos s�o m�ltiplos entre si. Aten��o: os n�meros devem poder ser digitados em
		// ordem crescente ou decrescente.

		// dividir por 3 e ver se o resto � igual a 0
		
		Scanner sc = new Scanner(System.in);
		int A = sc.nextInt();
		int B = sc.nextInt();
		int ver1 = A%3;
		int ver2 = B%3;
		if (ver1==0 && ver2==0) {
			System.out.println("Sao Multiplos");
		} else {
			System.out.println("Nao sao Multiplos");
		}
		sc.close();
	}

}
