import java.util.Scanner;

public class ex_05 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		/* Exercício 5: Ler o código de uma peça, valor unitário, quantidade de peças e retornar o total a pagar*/

		int codigo, quantidade;
		double valorUnitario, pagar;
		
		System.out.print("Digite o código da peça: ");
		codigo = sc.nextInt();
		
		System.out.print("Digite o valor unitário: R$ ");
		valorUnitario = sc.nextDouble();
		
		System.out.print("Digite a quantidade que deseja comprar: ");
		quantidade = sc.nextInt();
		
		pagar = quantidade * valorUnitario;
		
		System.out.printf("\nValor a pagar: R$ %.2f", pagar);
	}

}
