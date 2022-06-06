import java.util.Scanner;

public class ex_17 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		/* Exerc�cio 17: Um Posto de combust�veis deseja determinar qual de seus produtos tem a prefer�ncia de seus clientes. Escreva
		um algoritmo para ler o tipo de combust�vel abastecido (codificado da seguinte forma: 1.�lcool 2.Gasolina 3.Diesel
		4.Fim). Caso o usu�rio informe um c�digo inv�lido (fora da faixa de 1 a 4) deve ser solicitado um novo c�digo (at�
		que seja v�lido). O programa ser� encerrado quando o c�digo informado for o n�mero 4. Deve ser escrito a
		mensagem: "MUITO OBRIGADO" e a quantidade de clientes que abasteceram cada tipo de combust�vel, conforme
		exemplo. */
		
		int voto = 0, alcool = 0, gasolina = 0, diesel = 0, i = 1;
		
		System.out.println("[1] - �lcool"
				+ "\n[2] - Gasolina"
				+ "\n[3] - Diesel"
				+ "\n[4] - Fim");
		
		System.out.print("Digite qual o combust�vel que voc� abasteceu? ");
		voto = sc.nextInt();
		
		while (voto > 0 && voto < 4) {
			if (voto == 1) {
				alcool = alcool + i;
			}
			else if (voto == 2) {
				gasolina = gasolina + i; 
			}
			else {
				diesel = diesel + i;
			}
			System.out.printf("\n�lcool: %d", alcool);
			System.out.printf("\nGasolina: %d", gasolina);
			System.out.printf("\nDiesel: %d", diesel);
			
			System.out.print("\nDigite qual o combust�vel que voc� abasteceu? ");
			voto = sc.nextInt();
		}
		
		if (voto == 4) {
			System.out.print("Muito Obrigado!");
		}

	}

}
