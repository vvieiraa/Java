import java.util.Scanner;

public class ex_14 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);

		/* Leia um valor com duas casas decimais, equivalente ao salário de uma pessoa de Lisarb. Em seguida, calcule e
		mostre o valor que esta pessoa deve pagar de Imposto de Renda, segundo a tabela abaixo. */
		
		double salario, imposto;
		
		System.out.print("Digite o valor do salário: R$ ");
		salario = sc.nextDouble();
		
		if (salario <= 2000.00) {
			imposto = 0.00;
		}
		
		else if (salario <= 3000.00) {
			imposto = salario * 0.08;
		}
		
		else if (salario <= 4500.00) {
			imposto = salario * 0.18;		
		}
		
		else {
			imposto = salario * 0.28;
		}
		
		if (imposto == 0.00) {
			System.out.print("Isento de imposto");
		}
		
		else {
			System.out.printf("Imposto de R$ %.2f", imposto);
		}

	}

}
