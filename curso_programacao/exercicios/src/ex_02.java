import java.util.Scanner;

public class ex_02 {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		
		/* Exerc�cio 2: realizar o c�lculo de uma �rea a partir do valor do raio de um c�rculo */
		
			double raio, pi, area;
			
			pi = 3.14159;
			
			System.out.print("Digite o valor do raio: ");
			raio = sc.nextDouble();
			
			area = pi * (raio * raio);
			
			System.out.printf("A �rea � igual: %.4f", area);
	}

}
