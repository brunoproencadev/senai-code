package atividade;

import java.util.Scanner;

public class Actv2 {
	public static void main(String[] args) {
		var scanner = new Scanner(System.in);
		
		System.out.print("Digite a cotação do dólar: ");
		double cotacaoDolar = scanner.nextDouble();
		System.out.print("Digite o valor em dólares: ");
		double valorDolar = scanner.nextDouble();
		
		double valorReal = cotacaoDolar * valorDolar;
		System.out.printf("O valor em reais é: %.2f%n", valorReal);
		
		System.out.print("Deseja continuar? (S/N): ");
		String resposta = scanner.next().toUpperCase();
		
		while (resposta.equals("S")) {
			System.out.print("Digite a cotação do dólar: ");
			cotacaoDolar = scanner.nextDouble();
			System.out.print("Digite o valor em dólares: ");
			valorDolar = scanner.nextDouble();
			
			valorReal = cotacaoDolar * valorDolar;
			
			System.out.print("Deseja continuar? (S/N): ");
			resposta = scanner.next().toUpperCase();
		}
		
		scanner.close();
	}

}
