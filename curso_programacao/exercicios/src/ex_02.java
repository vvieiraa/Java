import java.util.Scanner;

public class ex_02 {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		
		/* Exercício 2: realizar o cálculo de uma área a partir do valor do raio de um círculo */
		
			double raio, pi, area;
			
			pi = 3.14159;
			
			System.out.print("Digite o valor do raio: ");
			raio = sc.nextDouble();
			
			area = pi * (raio * raio);
			
			System.out.printf("A área é igual: %.4f", area);
	}

}
