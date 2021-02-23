import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int A,B,C;
		
		A = sc.nextInt();
		B = sc.nextInt();
		C = sc.nextInt();
		
		if (A > B && A > C){
			System.out.println(A + " eh o maior");
		}
		
		if (B > A && B > C){
			System.out.println(B + " eh o maior");
		}		
		
		if (C > B && C > A){
			System.out.println(C + " eh o maior");
		}
		
		sc.close();

	}

}
