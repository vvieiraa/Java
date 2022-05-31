import java.util.Scanner;

public class ex_01 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		/* Exercício 1: a soma da entrada de dois valores */
		
			int a, b, soma;
			
			System.out.print("Digite o primeiro número: ");
			a = sc.nextInt();
			
			System.out.print("Digite o segundo número: ");
			b = sc.nextInt();
			
			soma = a + b;
			
			System.out.printf("\nO resultado da soma é: %d", soma);
	}

}
