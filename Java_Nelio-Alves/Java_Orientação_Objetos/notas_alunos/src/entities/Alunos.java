package entities;

public class Alunos {
	
	public String name;
	public double nota1;
	public double nota2;
	public double nota3;

	public double finalGrade() {
		return nota1+nota2+nota3;
	}
	
	public String toSting() {
		return String.format("%.2f", finalGrade());
	}
		
	public String status() {
		double geral = nota1+nota2+nota3;
		double aux = 0.0;
		if (geral < 60.0) {
			aux = 60.0 - geral;
			return "FAILED \nMISSING "
					+ String.format("%.2f", aux)
					+ " POINTS";
		}
		else {
			return "PASS";
		}
	}
	

	
}
