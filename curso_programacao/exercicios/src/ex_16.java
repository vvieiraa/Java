import java.util.Scanner;

public class ex_16 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);

		/* Exercício 17: Escreva um programa para ler as coordenadas (X,Y) de uma quantidade indeterminada de pontos no sistema
		cartesiano. Para cada ponto escrever o quadrante a que ele pertence. O algoritmo será encerrado quando pelo
		menos uma de duas coordenadas for NULA (nesta situação sem escrever mensagem alguma). */
		
		int x, y;
		
		System.out.print("Digite o valor de X: ");
		x = sc.nextInt();
		
		System.out.print("Digite o valor de Y: ");
		y = sc.nextInt();
		
		while (x != 0 && y != 0) {
			
			if (x > 0 && y > 0) {
				System.out.print("Primeiro quadrante");
			}
			
			else if (x < 0 && y > 0) {
				System.out.print("segundo quadrante");	
			}
			
			else if (x < 0 && y < 0) {
				System.out.print("terceiro quadrante");
			}
			
			else {
				System.out.print("quarto quadrante");
			}
			System.out.print("\nDigite o valor de X: ");
			x = sc.nextInt();
			System.out.print("Digite o valor de Y: ");
			y = sc.nextInt();
			
		}
		
		sc.close();
		
	}

}
