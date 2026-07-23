package atividade;

import java.util.Scanner;

public class actv15 {
	public static void main(String[] args) {
		var scanner = new Scanner(System.in);
		
		System.out.print("Digite o valor A do triangulo: ");
		int a = scanner.nextInt();
		System.out.print("Digite o valor B do triangulo: ");
		int b = scanner.nextInt();
		System.out.print("Digite o valor C do triangulo: ");
		int c = scanner.nextInt();
		
		boolean trueTriangulo = (a + b > c) && (a + c > b) && (b + c > a);
		
		if (trueTriangulo) {
            System.out.println("Os lados formam um triângulo válido.");

            if (a == b && b == c) {
                System.out.println("Tipo: Equilátero (Três lados iguais)");
            } else if (a == b || a == c || b == c) {
                System.out.println("Tipo: Isósceles (Dois lados iguais)");
            } else {
                System.out.println("Tipo: Escaleno (Todos os lados diferentes)");
            }
		}
		scanner.close();
	}
}