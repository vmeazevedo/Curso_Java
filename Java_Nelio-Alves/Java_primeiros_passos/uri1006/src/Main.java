import java.util.Locale;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		double n1,n2,n3;
		double fat1,fat2,fat3;
		double nf1,nf2,nf3;
		double media;
		
		n1 = sc.nextDouble();
		n2 = sc.nextDouble();
		n3 = sc.nextDouble();
		
		fat1 = 2;
		fat2 = 3;
		fat3 = 5;
		
		nf1 = n1 * fat1;
		nf2 = n2 * fat2;
		nf3 = n3 * fat3;
		
		media = (nf1 + nf2 + nf3) / 10;
		
		System.out.printf("MEDIA = %.1f%n", media);
		
		
		sc.close();

	}

}