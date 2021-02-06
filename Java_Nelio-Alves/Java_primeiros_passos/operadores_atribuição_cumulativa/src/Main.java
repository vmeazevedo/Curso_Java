import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		double p_basico = 100.0;
		double minuto = 2.0;
		double qt_minuto, saldo, calc;
		
		qt_minuto = sc.nextDouble();
		
		if (qt_minuto < 100.0) {
			System.out.println("Valor a pagar: R$ 50.00");
		}
		else {
			saldo = qt_minuto - 100.0;
			calc = (saldo * minuto) + 50.0;
			System.out.printf("Valor a pagar: R$ %.2f%n", calc);
		}
		
		sc.close();

	}

}
