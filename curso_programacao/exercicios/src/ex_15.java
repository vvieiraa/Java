import java.util.Scanner;

public class ex_15 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);

		/* Exerc�cio 15: Escreva um programa que repita a leitura de uma senha at� que ela seja v�lida. Para cada leitura de senha
		incorreta informada, escrever a mensagem "Senha Invalida". Quando a senha for informada corretamente deve ser
		impressa a mensagem "Acesso Permitido" e o algoritmo encerrado. Considere que a senha correta � o valor 2002. */
		
		int senha;
		
		System.out.print("Digite a sua senha: ");
		senha = sc.nextInt();
		
		while (senha != 2002) {
			System.out.println("Senha Invalida");
			System.out.print("\nDigite a sua senha: ");
			senha = sc.nextInt();
		}
		
		System.out.println("Acesso permitido");

	}

}
