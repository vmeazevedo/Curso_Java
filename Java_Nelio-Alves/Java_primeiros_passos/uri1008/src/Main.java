import java.util.Locale;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		int num_Func, num_Horas;
		double valor_Hora, salario;
		
		num_Func = sc.nextInt();
		num_Horas = sc.nextInt();
		valor_Hora = sc.nextDouble();
		
		salario = num_Horas * valor_Hora;
		
		System.out.println("NUMBER = " + num_Func);
		System.out.printf("SALARY = U$ %.2f%n", salario);
		
		sc.close();

	}

}
