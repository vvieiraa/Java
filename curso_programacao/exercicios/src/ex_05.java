import java.util.Scanner;

public class ex_05 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		/* Exerc�cio 5: Ler o c�digo de uma pe�a, valor unit�rio, quantidade de pe�as e retornar o total a pagar*/

		int codigo, quantidade;
		double valorUnitario, pagar;
		
		System.out.print("Digite o c�digo da pe�a: ");
		codigo = sc.nextInt();
		
		System.out.print("Digite o valor unit�rio: R$ ");
		valorUnitario = sc.nextDouble();
		
		System.out.print("Digite a quantidade que deseja comprar: ");
		quantidade = sc.nextInt();
		
		pagar = quantidade * valorUnitario;
		
		System.out.printf("\nValor a pagar: R$ %.2f", pagar);
	}

}
