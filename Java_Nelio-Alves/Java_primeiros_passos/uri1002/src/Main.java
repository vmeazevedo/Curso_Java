import java.util.Locale;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		double n = 3.14159;
		double raio;
		double area;
		
		raio = sc.nextDouble();
		area = n * Math.pow(raio,2);
		
		System.out.printf("A=%.4f%n", area);
		
		sc.close();
		
	}

}
