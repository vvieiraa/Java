import java.util.Scanner;

public class ex_01 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		/* Exerc�cio 1: a soma da entrada de dois valores */
		
			int a, b, soma;
			
			System.out.print("Digite o primeiro n�mero: ");
			a = sc.nextInt();
			
			System.out.print("Digite o segundo n�mero: ");
			b = sc.nextInt();
			
			soma = a + b;
			
			System.out.printf("\nO resultado da soma �: %d", soma);
	}

}
