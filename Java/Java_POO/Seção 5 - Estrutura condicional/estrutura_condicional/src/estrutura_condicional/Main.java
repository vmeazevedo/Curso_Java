package estrutura_condicional;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		// Estrutura condicional simples
		int x = 5;
		System.out.println("Bom dia");
		if (x<0) {								// se a condição for verdade executa o bloco de comando, se for falsa irá pular ele.
			System.out.println("Boa tarde");	
		}
		System.out.println("Boa noite");
	

		// Estrutura condicional composta
		Scanner sc = new Scanner(System.in);
		int hora;
		System.out.println("Quantas horas?");
		hora = sc.nextInt();
		
		if (hora<12 ) {
			System.out.println("Bom dia");
		}
		else {
			System.out.println("Boa tarde");
		}
		
		// Encadeamento de estruturas condicionais
		Scanner sc1 = new Scanner(System.in);
		int hora2;
		System.out.println("Quantas horas?");
		hora = sc1.nextInt();
		
		if (hora<12 ) {
			System.out.println("Bom dia");
		}
		else if (hora<18 ) {
			System.out.println("Boa tarde");
		}
		else {
			System.out.println("Boa noite");
		}
		sc.close();
		sc1.close();
	}
	
	
}
