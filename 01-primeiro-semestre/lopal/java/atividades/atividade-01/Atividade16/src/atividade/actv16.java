package atividade;

import java.util.Scanner;

public class actv16 {
	public static void main(String[] args) {
		var scanner = new Scanner(System.in);
		
		System.out.print("Digite a temperatura em Farenheit: ");
		double farenheit = scanner.nextDouble();
		
		double celsius = (farenheit - 32) * 5 / 9;
		
		System.out.printf("A temperatura em Celsius é: %.2f%n", celsius);
		
		scanner.close();
	}
}
