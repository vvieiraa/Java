import java.util.Scanner;

public class ex_07 {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		
		/* Fazer um programa para ler um n�mero inteiro, e depois dizer se este n�mero � negativo ou n�o. */

		int n1;
		
		System.out.print("Digite um n�mero inteiro: ");
		n1 = sc.nextInt();
		
		if (n1 < 0)
		{
			System.out.print("Negativo");
		}
		else
		{
			System.out.print("N�o Negativo");
		}
		
	}

}
