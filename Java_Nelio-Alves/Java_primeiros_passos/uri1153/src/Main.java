import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int n;
		int fat = 0;
		int soma =0;
		
		n = sc.nextInt();
		
		for (int i = 0; i < n; i++) {
			fat = n * (n-i);
			soma += fat;
			
		}
		
		System.out.println(soma);
		
		sc.close();

	}

}
