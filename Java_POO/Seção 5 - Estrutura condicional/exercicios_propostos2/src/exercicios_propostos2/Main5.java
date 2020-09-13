package exercicios_propostos2;
import java.util.Locale;
import java.util.Scanner;
public class Main5 {

	public static void main(String[] args) {
		// Ex5: Voc� deve fazer um programa que leia um valor qualquer e apresente uma mensagem dizendo em qual dos
		// seguintes intervalos ([0,25], (25,50], (50,75], (75,100]) este valor se encontra. Obviamente se o valor n�o estiver em
	    // nenhum destes intervalos, dever� ser impressa a mensagem �Fora de intervalo�.
		
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		double valor = sc.nextDouble();
		
		if (valor>0 && valor<=25.00) {
			System.out.println("Intervalo [0,25]");
		}
		if (valor>25.00 && valor<=50.00) {
			System.out.println("Intervalo (25,50]");
		}
		if (valor>50 && valor<=75) {
			System.out.println("Intervalo (50,75]");
		}
		if (valor>75 && valor<=100) {
			System.out.println("Intervalo (75,100]");
		}
		if (valor<0 || valor>100) {
			System.out.println("Fora de intervalo");
		}
		sc.close();
	}

}
