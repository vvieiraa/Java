import java.util.Scanner;

public class ex_07 {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		
		/* Fazer um programa para ler um número inteiro, e depois dizer se este número é negativo ou não. */

		int n1;
		
		System.out.print("Digite um número inteiro: ");
		n1 = sc.nextInt();
		
		if (n1 < 0)
		{
			System.out.print("Negativo");
		}
		else
		{
			System.out.print("Não Negativo");
		}
		
	}

}
