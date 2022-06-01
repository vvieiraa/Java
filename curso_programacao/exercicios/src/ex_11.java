import java.util.Scanner;

public class ex_11 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		/* Exercicio 11: leia o código de um item e a quantidade deste item. A seguir, calcule e mostre o valor da conta a pagar.*/
		
		int codigo, quantidade;
		double preco;
		
		System.out.print("[1] - Cachorro Quente, R$ 4,00\n"
				+ "[2] - X-Salada, R$ 4,50\n"
				+ "[3] - X-Bacon, R$ 5,00\n"
				+ "[4] - Torra simples, R$ 2,00\n"
				+ "[5] - Refrigerante, R$ 1,50\n");
		
		System.out.print("\nDigite o código: ");
		codigo = sc.nextInt();
		
		System.out.print("Digite a quantidade: ");
		quantidade = sc.nextInt();
		
		if (codigo == 1) {
			preco = quantidade * 4.00;
		} else if (codigo == 2) {
			preco = quantidade * 4.50;
		} else if (codigo == 3) {
			preco = quantidade * 5.00;
		} else if (codigo == 4) {
			preco = quantidade * 2.00;
		} else {
			preco = quantidade * 1.50;
		}
		
		System.out.printf("\nTotal: R$ %.2f", preco);
		

	}

}
