import java.util.Locale;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		int litros = 12;
		int horas, vel_media;
		double total, quantidade;
		
		horas = sc.nextInt();
		vel_media = sc.nextInt();
		
		total = horas * vel_media;
		quantidade = total / litros;
		
		System.out.printf("%.3f%n", quantidade);
		
		sc.close();
	}

}
