import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int x;
		int i;
		
		x = sc.nextInt();
		
		for (i=1; i<=x; i++) {
			if (i % 2 != 0) {	// se o resto da div de cada loop/2 for diferente de 0
				System.out.println(i);
			}
			sc.close();	
		}
		
		

	}

}
