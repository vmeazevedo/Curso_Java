package teste_processamento;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int x,y;
		double z;
		x = 5;
		y = 2*x;
		z = 10;
		System.out.println(x);
		System.out.println(y);
		System.out.println(z);
		
		// exemplo 3
		double b, B, h, area;
		b = 6.0;
		B = 8.0;
		h = 5.0;
		
		area = (b+B) / 2.0 * h;
		System.out.println(area); 
		
		// exemplo 4
		int a, d;
		double resultado;
		a = 5;
		d = 2;
		resultado = (double) a/d; 		// realizando o casting para converter os valores para double
		System.out.println(resultado);
		
		// exemplo 5
		double e;
		int f;
		e = 5.0;
		f = (int) e;					// realizando o casting para eliminar os valores depois da virgula
		System.out.println(f);
		
		
		
	}

}
