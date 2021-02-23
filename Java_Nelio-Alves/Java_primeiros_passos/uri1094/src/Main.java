import java.util.Locale;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		int n;
		int cont_c = 0;
		int cont_r = 0;
		int cont_s = 0;
		double p1,p2,p3;
		
		n = sc.nextInt();
		
		for (int i = 0; i < n; i++) {
			int x = sc.nextInt();
			String y = sc.next();
			if (y.equals("C")) {
				cont_c += x;
			}
			else if (y.equals("R")) {
				cont_r += x;
			}
			else if (y.equals("S")) {
				cont_s += x;
			}

	}
		int cont_t = cont_c+cont_r+cont_s;
		
		System.out.println("Total: " + (cont_t) + " cobaias");
		System.out.println("Total de coelhos: " + cont_c);
		System.out.println("Total de ratos: " + cont_r);
		System.out.println("Total de sapos: " + cont_s);
		
		p1 = (double) cont_c / cont_t * 100;
		System.out.printf("Percentual de coelhos: %.2f %%%n", p1);
		
		p2 = (double) cont_r / cont_t * 100;
		System.out.printf("Percentual de ratos: %.2f %%%n", p2);
		
		p3 = (double) cont_s / cont_t * 100;
		System.out.printf("Percentual de sapos: %.2f %%%n", p3);
		
		sc.close();

	}

}
