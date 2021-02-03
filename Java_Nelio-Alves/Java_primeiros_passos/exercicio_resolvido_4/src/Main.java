import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int num;
		int hora, minuto, segundo;
		int hora_resto;
		
		num = sc.nextInt();
		
		hora = num / 3600;
		hora_resto = num % 3600; 
		
		minuto = hora_resto / 60;
		segundo = hora_resto % 60;
				
		System.out.println(hora + ":" + minuto + ":" + segundo);
		
		sc.close();

	}

}
