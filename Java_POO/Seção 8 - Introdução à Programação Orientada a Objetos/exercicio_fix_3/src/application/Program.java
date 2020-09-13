package application;
import java.util.Locale;
import java.util.Scanner;

import entities.Student;
public class Program {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		Student st = new Student();
		st.nome = sc.nextLine();
		st.nota_Um = sc.nextDouble();
		st.nota_Dois = sc.nextDouble();
		st.nota_Tres = sc.nextDouble();
		
		System.out.printf("FINAL GRADE = %.2f%n", st.media());
		if (st.media() >= 60) {
			System.out.println("PASS");
		} else {
			System.out.println("FAILED");
			System.out.println("MISSING " + (60-st.media()) + " POINTS");
		}
		
		
		sc.close();
	}

}
