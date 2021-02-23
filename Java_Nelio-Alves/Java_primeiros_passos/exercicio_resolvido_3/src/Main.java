import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		String nome1, nome2;
		double media,idade1, idade2;
		
		nome1 = sc.next();
		idade1 = sc.nextDouble();
		nome2 = sc.next();
		idade2 = sc.nextDouble();
		media = (idade1+idade2) / 2;
		
		System.out.printf("A idade media de %s e %s é de %.1f anos", nome1, nome2, media);
		
		sc.close();

	}

}
