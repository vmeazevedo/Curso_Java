package exercicios_propostos2;
import java.util.Scanner;
public class Main3 {

	public static void main(String[] args) {
		// Ex4: Leia a hora inicial e a hora final de um jogo. A seguir calcule a duração do jogo, sabendo que o mesmo pode
		// começar em um dia e terminar em outro, tendo uma duração mínima de 1 hora e máxima de 24 horas.
		Scanner sc = new Scanner(System.in);
		int hora_init = sc.nextInt();
		int hora_final = sc.nextInt();
		int duracao;
		
		if (hora_init < hora_final) {
			duracao = hora_final - hora_init;
		} else {
			duracao = 24 - hora_init + hora_final;
		} 
		
		System.out.printf("O JOGO DURA %s HORA(S)", duracao);
		sc.close();
		
	}

}
