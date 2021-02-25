package application;

import java.util.Locale;
import java.util.Scanner;

import util.Calculos;

public class Main {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		System.out.println("1. Adição");
		System.out.println("2. Subtração");
		System.out.println("3. Multiplicação");
		System.out.println("4. Divisão");
		
		int escolha;
		System.out.print("Informe a opção desejada: ");
		escolha = sc.nextInt();
		
		System.out.print("\nInforme os valor de A: ");
		Calculos.Valor_A = sc.nextDouble();
		System.out.print("Informe os valor de B: ");
		Calculos.Valor_B = sc.nextDouble();
		
		if (escolha == 1) {
			System.out.printf("Resultado da adição: %.2f%n", Calculos.adicao());			
		}
		else if (escolha == 2) {
			System.out.printf("Resultado da subtração: %.2f%n", Calculos.subtracao());
		}
		else if (escolha == 3) {
			System.out.printf("Resultado da multiplicação: %.2f%n", Calculos.multiplicacao());
		}
		else if (escolha == 5) {
			System.out.printf("Resultado da divisão: %.2f%n", Calculos.divisao());
		}
		else {
			System.out.println("Digite somente os números indicados");
		}
				
		sc.close();

	}

}
