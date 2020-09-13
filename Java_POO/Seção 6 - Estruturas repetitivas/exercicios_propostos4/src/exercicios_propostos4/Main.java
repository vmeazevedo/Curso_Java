package exercicios_propostos4;
import java.util.Scanner;
public class Main {

	public static void main(String[] args) {
		// Ex1: Leia um valor inteiro X (1 <= X <= 1000). Em seguida mostre os ímpares de 1 até X, um valor por linha, inclusive o
		// X, se for o caso.
		
		Scanner sc = new Scanner(System.in);
		int x = sc.nextInt();
		for (int i=1; i<=x; i+=2) {
			System.out.println(i);
		}
		sc.close();
	}

}
