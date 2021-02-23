import java.util.Locale;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		String vendedor;
		double salario_Fixo, total_Vendas, total_Receber;
		double porcentagem = 0.15;
		
		vendedor = sc.next();
		salario_Fixo = sc.nextDouble();
		total_Vendas = sc.nextDouble();
		total_Receber = ((porcentagem * total_Vendas) + salario_Fixo);
		
		System.out.printf("TOTAL = R$ %.2f%n", total_Receber);
		
		sc.close();

	}

}
