import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int A,B,P;
		A = sc.nextInt();
		B = sc.nextInt();
		P = A * B;
		
		System.out.println("PROD = " + P);
		
		
		sc.close();
		

	}

}