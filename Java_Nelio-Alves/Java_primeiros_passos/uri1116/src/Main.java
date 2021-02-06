import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int n,i,x,y;
		double div;
		
		n = sc.nextInt();
		
		for (i=0; i<n; i++) {
			x = sc.nextInt();
			y = sc.nextInt();
			if (y == 0) {
				System.out.println("divisão impossivel");
			}
			else {
				div = (double) x / y;
				System.out.printf("%.1f%n",div);
			}
			
		}
		
		sc.close();

	}

}
