import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int x,y;
		int min, max;
		int soma = 0;
		
		x = sc.nextInt();
		y = sc.nextInt();
				
		if ( x < y ) {
			min = x;
			max = y;
		}
		else {
			min = y;
			max = x;
		}
				
		for ( int i = min+1; i < max; i++) {
			if (i % 2 != 0) {
				soma += i;
			}
		}
		
		System.out.println(soma);
		
		sc.close();

	}

}
