import java.util.Locale;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		double n1,n2;
		double fat1,fat2;
		double nf1,nf2;
		double media;
		
		n1 = sc.nextDouble();
		n2 = sc.nextDouble();
		
		fat1 = 3.5;
		fat2 = 7.5;
		
		nf1 = n1 * fat1;
		nf2 = n2 * fat2;
		
		media = (nf1 + nf2) / 11;
		
		System.out.printf("MEDIA = %.5f%n", media);
		
		
		sc.close();

	}

}
