import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int n,i,x;
		
		n = sc.nextInt();
		
		for (i=0; i<n; i++) {
			
			x = sc.nextInt();
			
			if (x % 2 == 0 && x > 0) {
				System.out.println("EVEN POSITIVE");
			}
			else if (x % 2 == 0 && x < 0) {
				System.out.println("EVEN NEGATIVE");
			}
			else if (x % 2 != 0 && x > 0) {
				System.out.println("ODD POSITIVE");
			}
			else if (x % 2 != 0 && x < 0) {
				System.out.println("ODD NEGATIVE");
			}
			else if (x == 0) {
				System.out.println("NULL");
			}
		}
		
		
		
		sc.close();

	}

}
