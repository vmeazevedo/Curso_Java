package application;

import java.util.Locale;
import java.util.Scanner;

import entities.Alunos;

public class Program {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		Alunos dado;
		dado = new Alunos();
		
		dado.name = sc.nextLine();
		dado.nota1 = sc.nextDouble();
		dado.nota2 = sc.nextDouble();
		dado.nota3 = sc.nextDouble();
		
		System.out.print("FINAL GRADE = " + dado.finalGrade() + "\n");
		System.out.println(dado.status());
		
		
		sc.close();

	}

}
