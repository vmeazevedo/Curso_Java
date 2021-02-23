import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int n;
		int s0 = 0;
		int s1 = 0;
		int s2 = 0;
		int p = 0;
		
		n = sc.nextInt();
		
		for (int i = 1; i <= 27; i=i+4) {
			s0 = i;
			System.out.print(s0 + " ");
			s1 = i+1;
			System.out.print(s1 + " ");
			s2 = s1+1;
			System.out.print(s2 + " ");
			p = s2+1;
			System.out.println("PUM");
			
		}

		
		sc.close();

	}

}
