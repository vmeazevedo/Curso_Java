package application;
import java.util.Locale;
import java.util.Scanner;

public class Program {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		// declaramos um n que será a quantidade de digitos de nosso vetor
		int n = sc.nextInt();
		
		// declaramos o vetor que irá ter o tamanho de n
		double[] vect = new double[n]; 
		
		// criamos um for iniciado em 0 que percorra até o meu i<n, incrementando +1
		for (int i=0; i<n; i++) {
			// enquanto o meu i<n o meu vector recebe o input digitado para cada ciclo
			vect[i] = sc.nextDouble();
		}
		
		// declaro uma variavel que recebera a soma
		double sum = 0.0;
		// criamos um for iniciado em 0 que percorra até o meu i<n, incrementando +1
		for (int i=0; i<n; i++) {
			// para cada ciclo iremos somar o valor de sum com o novo valor do vetor
			sum += vect[i];
		}
		// calculando a media
		double avg = sum / n;
		
		System.out.printf("AVERAGE HEIGHT: %.2f%n", avg);
		
		sc.close();

	}

}
