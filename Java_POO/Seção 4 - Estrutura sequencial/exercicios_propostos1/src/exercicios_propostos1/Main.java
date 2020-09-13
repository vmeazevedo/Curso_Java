package exercicios_propostos1;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		// Ex1: Faça um programa para ler dois valores inteiros, e depois mostrar na tela a soma desses números com uma
		// mensagem explicativa, conforme exemplos.
		
		Scanner sc = new Scanner(System.in);
		int A,B,soma;
		A = sc.nextInt();
		B = sc.nextInt();
		soma = A+B;
		System.out.println("SOMA = " + soma);
		
	}

}
