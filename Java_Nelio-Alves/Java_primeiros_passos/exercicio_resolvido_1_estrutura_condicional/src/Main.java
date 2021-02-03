import java.util.Locale;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		double n1,n2, nf;
		
		n1 = sc.nextDouble();
		n2 = sc.nextDouble();
		nf = n1+n2;
		
		if (nf < 60.00) {
			System.out.printf("NOTA FINAL = %.1f%n", nf);
			System.out.println("REPROVADO");
		}
		else {
			System.out.printf("NOTA FINAL = %.1f%n", nf);
		}
		
		
		sc.close();

	}

}
