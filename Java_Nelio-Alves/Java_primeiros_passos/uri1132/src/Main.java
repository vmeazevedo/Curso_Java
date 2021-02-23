import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int x,y;
		int soma = 0;
		int min, max;
		
		x = sc.nextInt();
		y = sc.nextInt();
		
		if (x>y) {
			max = x;
			min = y;
		}
		else {
			max = y;
			min = x;
		}
		
		for (int i = min; i <= max; i++ ) {
			if (i % 13 != 0 ) {
				soma += i;
			
			}
		}
		
		System.out.println(soma);
		
		sc.close();

	}

}
