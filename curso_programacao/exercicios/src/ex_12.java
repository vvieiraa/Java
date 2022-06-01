import java.util.Scanner;

public class ex_12 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);

		/* Você deve fazer um programa que leia um valor qualquer e apresente uma mensagem dizendo em qual dos
seguintes intervalos ([0,25], (25,50], (50,75], (75,100]) este valor se encontra. Obviamente se o valor não estiver em
nenhum destes intervalos, deverá ser impressa a mensagem “Fora de intervalo”. */
		
		double n1;
		
		System.out.print("Digite um número: ");
		n1 = sc.nextDouble();
		
		if (n1 >= 0 && n1 <= 25) 
		{
			System.out.print("Interval [0, 25]");
		} 
		else if (n1 > 25 && n1 <= 50) 
		{
			System.out.print("Interval [25, 50]");
		}
		else if (n1 > 50 && n1 <= 75) 
		{
			System.out.print("Interval [50, 75]");
		}
		else if (n1 > 75 && n1 <= 100)
		{
			System.out.print("Interval [75, 100]");
		}
		else
		{
			System.out.print("Fora do intervalo");
		}

	}

}
