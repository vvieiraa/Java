import java.util.Scanner;

public class ex_04 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		/* Exerc�cio 4: ler a matr�cula do funcion�rio, o n�mero de horas trabalhadas, valor que recebe por hora, ent�o retornar a matr�cula e o sal�rio */
		
			int matricula;
			double horas, salario, valorHora;
			
			System.out.print("Digite o n�mero da matr�cula do funcion�rio: ");
			matricula = sc.nextInt();
			
			System.out.print("Digite o n�mero de horas trabalhadas do funcion�rio: ");
			horas = sc.nextDouble();
			
			System.out.print("Digite o valor por hora do funcion�rio: ");
			valorHora = sc.nextDouble();
			
			salario = horas * valorHora;
			
			System.out.printf("\nMatr�cula: %d\n", matricula);
			System.out.printf("Sal�rio: R$ %.2f", salario);
	}

}
