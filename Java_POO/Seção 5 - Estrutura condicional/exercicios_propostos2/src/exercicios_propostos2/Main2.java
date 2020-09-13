package exercicios_propostos2;

import java.util.Scanner;

public class Main2 {

	public static void main(String[] args) {
		// Ex3: Leia 2 valores inteiros (A e B). Após, o programa deve mostrar uma mensagem "Sao Multiplos" ou "Nao sao
		// Multiplos", indicando se os valores lidos são múltiplos entre si. Atenção: os números devem poder ser digitados em
		// ordem crescente ou decrescente.

		// dividir por 3 e ver se o resto é igual a 0
		
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
