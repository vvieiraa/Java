import java.util.Scanner;

public class ex_03 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		/* Exerc�cio 3: ler quatro n�meros inteiros e calcular a diferen�a dos produtos */
		
			int n1, n2, n3, n4, diferenca;
			
			System.out.print("Digite o primeiro n�mero: ");
			n1 = sc.nextInt();
			
			System.out.print("Digite o segundo n�mero: ");
			n2 = sc.nextInt();
			
			System.out.print("Digite o terceiro n�mero: ");
			n3 = sc.nextInt();
			
			System.out.print("Digite o quarto n�mero: ");
			n4 = sc.nextInt();
			
			diferenca = (n1 * n2 - n3 * n4);
			
			System.out.printf("A diferen�a � igual a: %d", diferenca);	
	}

}
