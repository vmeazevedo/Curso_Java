package objeto_scanner;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner sc = new Scanner(System.in);
		// Leitura de uma palavra
		String x;
		x = sc.next();				
		System.out.println("Voc� digitou: " + x);
		
		// Leitura de um n�mero inteiro
		int y;
		y = sc.nextInt();
		System.out.println("Voc� digitou: " + y);
		
		// Leitura de um n�mero com ponto flutuante
		double z;
		z = sc.nextDouble();
		System.out.println("Voc� digitou: " + z);
		
		// Leitura de um caractere
		char a;
		a = sc.next().charAt(0);
		System.out.println("Voc� digitou: " + a);
		
		// Leitura de v�rios dados seguidos
		String nome;
		int valor;
		double salario;
		nome = sc.next();
		valor = sc.nextInt();
		salario = sc.nextDouble();
		System.out.println("Dados digitados: ");
		System.out.println(nome);
		System.out.println(valor);
		System.out.println(salario);
		
		sc.close();
	}

}
