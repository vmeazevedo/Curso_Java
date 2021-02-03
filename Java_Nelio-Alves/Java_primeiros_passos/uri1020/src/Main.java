import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int idade_dias,ano,mes,dia,resto, resto2;
		
		idade_dias = sc.nextInt();
		
		ano = idade_dias / 365;
		resto = idade_dias % 365;
				
		mes = resto / 30;
		resto2 = resto % 30;
				
		dia = resto2;
		
		System.out.println(ano + " ano(s)");
		System.out.println(mes + " mes(es)");
		System.out.println(dia + " dia(s)");
		
		
		sc.close();

	}

}
