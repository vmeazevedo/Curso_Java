package objeto_scanner;

import java.util.Scanner;

public class Main2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		// Tratando uma quebra de linha pendente
		Scanner sc2 = new Scanner(System.in);
		int x;
		String s11,s22,s33;
		
		x = sc2.nextInt();		// Quando damos uma comando diferente do nextline anterior a outro nextline e damos uma quebra de linha essa quebra de linha
		sc2.nextLine();			// fica pendente na entrada padrão. Para corrigir isso basta dar um outro nextLine que ira resolver.	
		s11 = sc2.nextLine();
		s22 = sc2.nextLine();
		s33 = sc2.nextLine();
		
		sc2.close();
		
		System.out.println("DADOS DIGITADOS: ");
		System.out.println(x);
		System.out.println(s11);
		System.out.println(s22);
		System.out.println(s33);

	}

}
