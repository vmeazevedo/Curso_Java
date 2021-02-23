package entities;

public class Rectangle {
	
	public double largura;
	public double altura;

	public double area() {
		return largura * altura;
	}
	
	public double perimeter() {
		return 2.0 * (largura + altura);
	}
	
	public double diagonal() {
		double diagonal = Math.sqrt((Math.pow(largura, 2.0) + Math.pow(altura, 2.0)));
		return diagonal;
	}
	
	public String toString() {
		return "AREA = "
			+ String.format("%.2f", area())
			+ "\nPERIMETER = "
			+ String.format("%.2f", perimeter())
			+ "\nDIAGONAL = "
			+ String.format("%.2f", diagonal());	
	}	
}
