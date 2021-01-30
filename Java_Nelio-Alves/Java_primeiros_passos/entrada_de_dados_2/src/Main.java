import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int x;
		String s1,s2,s3;
		
		System.out.println("Informe um numero e insira 3 frases a sua escolha: ");
		x = sc.nextInt();
		sc.nextLine();			// Quando temos uma nextInt antes do nextLine devemos colocar um outro nextLine entre eles.
		s1 = sc.nextLine();
		s2 = sc.nextLine();
		s3 = sc.nextLine();
		
		System.out.println("DADOS DIGITADOS: ");
		System.out.println(x);
		System.out.println(s1);
		System.out.println(s2);
		System.out.println(s3);
		
	}

}
