import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int n, x, i;
		int cont_in = 0; 
		int cont_out = 0;
		
		n = sc.nextInt();
		
		for (i=0; i<n; i++) {
			x = sc.nextInt();
			if (x >= 10 && x <= 20) {
				cont_in += 1;
			}
			else {
				cont_out += 1;
			}
		}
		
		System.out.println(cont_in + " in");
		System.out.println(cont_out + " out");
		
		sc.close();
		
	}
	
}
		
		
		
	
		

	


