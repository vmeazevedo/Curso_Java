import java.util.Locale;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		double n1,n2;
		double media;
		
		n1 = sc.nextDouble();
		n2 = sc.nextDouble();
		
		
		while ( n1 != 0.0 && n2 != 0.0) {
			if ( n1 < 0.0 || n1 > 10.0 || n2 < 0.0 || n2 > 10.0 ) {
				System.out.println("nota invalida");
				n1 = sc.nextDouble();
				n2 = sc.nextDouble();
			}
			else {
				media = (n1 + n2) / 2;
				System.out.printf("media = %.2f%n",media);
				break;
			}
		}
		
		sc.close();

	}

}
