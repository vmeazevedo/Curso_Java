import java.util.Locale;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		
		Scanner sc = new Scanner(System.in);
		
		double A,B,C;
		double area_Triangulo, area_Circulo, area_Trapezio, area_quadrado, area_retangulo;
		
		A = sc.nextDouble();
		B = sc.nextDouble();
		C = sc.nextDouble();
		
		area_Triangulo = (A*C) / 2;
		area_Circulo = 3.14159 * Math.pow(C, 2);
		area_Trapezio = ((A+B) * C) / 2;
		area_quadrado = Math.pow(B, 2);
		area_retangulo = A*B;
		
		System.out.printf("TRIANGULO: %.3f%n", area_Triangulo);
		System.out.printf("CIRCULO: %.3f%n", area_Circulo);
		System.out.printf("TRAPEZIO: %.3f%n", area_Trapezio);
		System.out.printf("QUADRADO: %.3f%n", area_quadrado);
		System.out.printf("RETANGULO: %.3f%n", area_retangulo);
		
		sc.close();

	}

}
