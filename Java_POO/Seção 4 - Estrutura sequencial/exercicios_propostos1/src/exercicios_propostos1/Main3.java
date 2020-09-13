package exercicios_propostos1;

import java.util.Locale;
import java.util.Scanner;

public class Main3 {

	public static void main(String[] args) {
		// Ex4: Fazer um programa que leia o número de um funcionário, seu número de horas trabalhadas, o valor que recebe por
		//hora e calcula o salário desse funcionário. A seguir, mostre o número e o salário do funcionário, com duas casas
		//decimais.
		
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		int num = sc.nextInt();
		int hrt = sc.nextInt();
		double hrr = sc.nextDouble();
		double salario = hrt*hrr;
		System.out.println("NUMBER = " + num);
		System.out.printf("SALARY = U$ %.2f%n", salario);
		
		sc.close();
	}

}
