import java.util.Scanner;

public class ex_09 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		/* Exerc�cio 9: Ler 2 valores inteiros (A e B). Ap�s, o programa deve mostrar uma mensagem "S�o M�ltiplos" ou "N�o s�o M�ltiplos" */
		
		int n1, n2;
		
		System.out.print("Digite o primeiro n�mero: ");
		n1 = sc.nextInt();
		
		System.out.print("Digite o segundo n�mero: ");
		n2 = sc.nextInt();
		
		if (n1 % n2 == 0 || n2 % n1 == 0) 
		{
			System.out.print("S�o m�ltiplos");
		}
		else
		{
			System.out.print("N�o s�o m�ltiplos");
		}
		
	}

}
