import java.util.Locale;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		System.out.print("Digite um nome: ");
		String x;
		x = sc.next();
		System.out.println("Você digitou: " + x);
		
		System.out.print("Digite um número: ");
		int x1;
		x1 = sc.nextInt();
		System.out.println("Você digitou: " + x1);
		
		System.out.print("Digite um número com ponto flutuante: ");
		double x2;
		x2 = sc.nextDouble();
		System.out.println("Você digitou: " + x2);
		
		sc.close();

	}

}
