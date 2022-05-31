import java.util.Scanner;

public class ex_03 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		/* Exercício 3: ler quatro números inteiros e calcular a diferença dos produtos */
		
			int n1, n2, n3, n4, diferenca;
			
			System.out.print("Digite o primeiro número: ");
			n1 = sc.nextInt();
			
			System.out.print("Digite o segundo número: ");
			n2 = sc.nextInt();
			
			System.out.print("Digite o terceiro número: ");
			n3 = sc.nextInt();
			
			System.out.print("Digite o quarto número: ");
			n4 = sc.nextInt();
			
			diferenca = (n1 * n2 - n3 * n4);
			
			System.out.printf("A diferença é igual a: %d", diferenca);	
	}

}
