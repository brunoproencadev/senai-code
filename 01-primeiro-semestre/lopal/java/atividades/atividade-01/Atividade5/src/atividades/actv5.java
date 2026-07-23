package atividades;

import java.util.Scanner;

public class actv5 {
	public static void main(String[] args) {
		var scanner = new Scanner(System.in);
		
		double minimumWage = 1621.00;
		System.out.print("Digite o valor do salário: ");
		double salary = scanner.nextDouble();
		
		double c = salary / minimumWage;
		System.out.printf("O salário informado é equivalente a %.2f salários mínimos.%n", c);
		
		scanner.close();
	}

}
