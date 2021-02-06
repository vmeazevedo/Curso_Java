import java.util.Locale;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		double sal,calc;
		double p_15 = 15.0/100.0;
		double p_12 = 12.0/100.0;
		double p_10 = 10.0/100.0;
		double p_7 = 7.0/100.0;
		double p_4 = 4.0/100.0;
		
		sal = sc.nextDouble();
		
		
		if (sal > 0 && sal <= 400.0 ) {
			calc = (p_15 * sal);
			System.out.printf("Novo salario: %.2f%n", sal+calc);
			System.out.printf("Reajuste ganho: %.2f%n",calc);
			System.out.println("Em percentual: 15 %");
		}
		else if (sal >= 400.01 && sal <= 800.0) {
			calc = (p_12 * sal);
			System.out.printf("Novo salario: %.2f%n", sal+calc);
			System.out.printf("Reajuste ganho: %.2f%n",calc);
			System.out.println("Em percentual: 12 %");
		}
		else if (sal >= 800.01 && sal <= 1200.0) {
			calc = (p_10 * sal);
			System.out.printf("Novo salario: %.2f%n", sal+calc);
			System.out.printf("Reajuste ganho: %.2f%n",calc);
			System.out.println("Em percentual: 10 %");
		}
		else if (sal >= 1200.01 && sal <= 2000.0) {
			calc = (p_7 * sal);
			System.out.printf("Novo salario: %.2f%n", sal+calc);
			System.out.printf("Reajuste ganho: %.2f%n",calc);
			System.out.println("Em percentual: 7 %");
		}
		else if (sal < 2000.0) {
			calc = (p_4 * sal);
			System.out.printf("Novo salario: %.2f%n", sal+calc);
			System.out.printf("Reajuste ganho: %.2f%n",calc);
			System.out.println("Em percentual: 4 %");
		}
		sc.close();

	}

}
