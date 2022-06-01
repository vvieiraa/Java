import java.util.Scanner;

public class ex_08 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		double n1, resultado;
		
		System.out.print("Digite um número para verificar se é ímpar ou par: ");
		n1 = sc.nextDouble();
		
		resultado = n1 % 2;
		
		if (resultado == 0.0) 
		{
			System.out.print("Par");
		}
		else 
		{
			System.out.print("Ímpar");
		}
		
	}
	
}
