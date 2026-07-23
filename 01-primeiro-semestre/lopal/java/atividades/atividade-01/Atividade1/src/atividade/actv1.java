package atividade;

import java.util.Scanner;

public class actv1 {
	public static void main(String[] args) {
		var scanner = new Scanner(System.in);
		
		System.out.print("Digite o valor A: ");
		double a = scanner.nextDouble();
		System.out.print("Digite o valor B: ");
		double b = scanner.nextDouble();
		System.out.print("Digite o valor C: ");
		double c = scanner.nextDouble();
		
		double sum = a + b + c;
		System.out.println("A soma dos valores é: " + sum);
		
		if (sum < c) {
			System.out.println("A soma dos valores é menor que C.");
		}
		
		scanner.close();
	}

}