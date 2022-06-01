import java.util.Scanner;

public class ex_09 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		/* Exercício 9: Ler 2 valores inteiros (A e B). Após, o programa deve mostrar uma mensagem "São Múltiplos" ou "Não são Múltiplos" */
		
		int n1, n2;
		
		System.out.print("Digite o primeiro número: ");
		n1 = sc.nextInt();
		
		System.out.print("Digite o segundo número: ");
		n2 = sc.nextInt();
		
		if (n1 % n2 == 0 || n2 % n1 == 0) 
		{
			System.out.print("São múltiplos");
		}
		else
		{
			System.out.print("Não são múltiplos");
		}
		
	}

}
