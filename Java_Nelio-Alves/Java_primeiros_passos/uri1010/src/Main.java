import java.util.Locale;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		int cod1, num1, cod2, num2;
		double val1, val2, total;

		cod1 = sc.nextInt();
		num1 = sc.nextInt();
		val1 = sc.nextDouble();
		
		cod2 = sc.nextInt();
		num2 = sc.nextInt();
		val2 = sc.nextDouble();
		
		total = (num1*val1) + (num2*val2);
		System.out.printf("VALOR A PAGAR: R$ %.2f%n", total);
		
		sc.close();
		
		
	}

}
