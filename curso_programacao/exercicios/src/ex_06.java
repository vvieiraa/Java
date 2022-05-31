import java.util.Scanner;

public class ex_06 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		/* Exercício 6: Fazer um programa que leia três valores com ponto flutuante de dupla precisão: A, B e C. Em seguida, calcule e mostre:
		a) a área do triângulo retângulo que tem A por base e C por altura.
		b) a área do círculo de raio C. (pi = 3.14159)
		c) a área do trapézio que tem A e B por bases e C por altura.
		d) a área do quadrado que tem lado B.
		e) a área do retângulo que tem lados A e B. */
		
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

		System.out.printf("Triângulo: %.3f", triangulo);
		System.out.printf("\nCírculo: %.3f", circulo);
		System.out.printf("\nTrapézio: %.3f", trapezio);
		System.out.printf("\nQuadrado: %.3f", quadrado);
		System.out.printf("\nRetângulo: %.3f", retangulo);
	}

}
