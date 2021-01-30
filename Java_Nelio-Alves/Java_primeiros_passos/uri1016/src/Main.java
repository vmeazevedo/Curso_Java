import java.util.Locale;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {

		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);

		int n, resultado;
	    
		n = sc.nextInt();
		
		resultado = 2 * n;
		
		System.out.println(resultado + " minutos");
		
		sc.close();
	}
}
