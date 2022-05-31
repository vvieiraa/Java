import java.util.Scanner;

public class ex_04 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		/* Exercício 4: ler a matrícula do funcionário, o número de horas trabalhadas, valor que recebe por hora, então retornar a matrícula e o salário */
		
			int matricula;
			double horas, salario, valorHora;
			
			System.out.print("Digite o número da matrícula do funcionário: ");
			matricula = sc.nextInt();
			
			System.out.print("Digite o número de horas trabalhadas do funcionário: ");
			horas = sc.nextDouble();
			
			System.out.print("Digite o valor por hora do funcionário: ");
			valorHora = sc.nextDouble();
			
			salario = horas * valorHora;
			
			System.out.printf("\nMatrícula: %d\n", matricula);
			System.out.printf("Salário: R$ %.2f", salario);
	}

}
