import java.util.Scanner;

public class ex_10 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		/* Leia a hora inicial e a hora final de um jogo. A seguir calcule a duração do jogo, sabendo que o mesmo pode
começar em um dia e terminar em outro, tendo uma duração mínima de 1 hora e máxima de 24 horas. */
		
		int inicio, fim, tempo;
		
		System.out.print("Digite a hora do ínicio do jogo: ");
		inicio = sc.nextInt();
		
		System.out.print("Digite a hora do final do jogo: ");
		fim = sc.nextInt();
		
		if (inicio > fim)
		{
			tempo = 24 - inicio + fim;
		}
		
		else if (fim > inicio) 
		{
			tempo = fim - inicio;
		}
		
		else 
		{
			tempo = 24;
		}
		
		System.out.printf("O jogo durou %d Hora(s)", tempo);

	}

}
