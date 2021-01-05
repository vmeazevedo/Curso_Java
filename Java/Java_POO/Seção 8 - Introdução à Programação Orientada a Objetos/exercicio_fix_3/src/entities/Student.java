package entities;

public class Student {
	
	public String nome;
	public double nota_Um;
	public double nota_Dois;
	public double nota_Tres;
	
	public double media() {
		return nota_Um + nota_Dois + nota_Tres;
	}
		
}
