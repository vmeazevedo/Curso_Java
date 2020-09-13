package exercicios_propostos1;

import java.util.Locale;
import java.util.Scanner;

public class Main1 {

	public static void main(String[] args) {
		// Ex2: Faça um programa para ler o valor do raio de um círculo, e depois mostrar o valor da área deste círculo com quatro
		// casas decimais conforme exemplos.
		// Fórmula da área: area = pi . raio2
		// Considere o valor de pi = 3.14159
		
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		double area, raio;
		double pi = 3.14159;
		raio = sc.nextDouble();
		area = pi * (Math.pow(raio, 2.0));
		System.out.printf("A=%.4f%n", area);
			
		
	}

}
