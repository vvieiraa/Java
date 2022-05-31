import java.util.Scanner;

public class ex_06 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		/* Exerc�cio 6: Fazer um programa que leia tr�s valores com ponto flutuante de dupla precis�o: A, B e C. Em seguida, calcule e mostre:
		a) a �rea do tri�ngulo ret�ngulo que tem A por base e C por altura.
		b) a �rea do c�rculo de raio C. (pi = 3.14159)
		c) a �rea do trap�zio que tem A e B por bases e C por altura.
		d) a �rea do quadrado que tem lado B.
		e) a �rea do ret�ngulo que tem lados A e B. */
		
		double a, b, c, triangulo, circulo, trapezio, quadrado, retangulo, pi;
		
		pi = 3.14159;
		
		System.out.print("Digite o valor de A: ");
		a = sc.nextDouble();
		
		System.out.print("Digite o valor de B: ");
		b = sc.nextDouble();
		
		System.out.print("Digite o valor de C: ");
		c = sc.nextDouble();
		
		triangulo = (a * c) / 2;
		circulo = pi * (c * c);
		trapezio = ((a + b) * c) / 2;
		quadrado = b * b;
		retangulo = a * b;

		System.out.printf("Tri�ngulo: %.3f", triangulo);
		System.out.printf("\nC�rculo: %.3f", circulo);
		System.out.printf("\nTrap�zio: %.3f", trapezio);
		System.out.printf("\nQuadrado: %.3f", quadrado);
		System.out.printf("\nRet�ngulo: %.3f", retangulo);
	}

}
