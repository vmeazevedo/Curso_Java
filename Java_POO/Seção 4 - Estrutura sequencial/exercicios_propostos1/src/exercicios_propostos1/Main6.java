package exercicios_propostos1;

import java.util.Locale;
import java.util.Scanner;

public class Main6 {

	public static void main(String[] args) {
		// Fazer um programa que leia três valores com ponto flutuante de dupla precisão: A, B e C. Em seguida, calcule e
		//mostre:
		//	a) a área do triângulo retângulo que tem A por base e C por altura.
		//	b) a área do círculo de raio C. (pi = 3.14159)
		//	c) a área do trapézio que tem A e B por bases e C por altura.
		//	d) a área do quadrado que tem lado B.
		//	e) a área do retângulo que tem lados A e B.
		
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		double A = sc.nextDouble();
		double B = sc.nextDouble();
		double C = sc.nextDouble();
		
		double areaT = (A*C)/2;
		System.out.printf("TRIANGULO: %.3f%n", areaT);
		
		double areaC = 3.14159 * (Math.pow(C,2));
		System.out.printf("CIRCULO: %.3f%n", areaC);
		
		double areaTra = C*(A+B) / 2;
		System.out.printf("TRAPEZIO: %.3f%n", areaTra);
		
		double areaQ = Math.pow(B, 2);
		System.out.printf("QUADRADO: %.3f%n", areaQ);
		
		double areaR = A*B;
		System.out.printf("RETANGULO: %.3f%n", areaR);

		
		sc.close();

	}

}
