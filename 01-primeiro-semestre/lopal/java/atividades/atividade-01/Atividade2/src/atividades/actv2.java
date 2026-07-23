package atividades;

import java.util.Scanner;

public class actv2 {
	public static void main(String[] args) {
		var scanner = new Scanner(System.in);
		
		System.out.print("Digite o valor: ");
		int a = scanner.nextInt();
		
		if(a > 0) {
			System.out.println("O valor é positivo.");
			if (a % 2 == 0) {
				System.out.println("O valor é par.");
			} else {
				System.out.println("O valor é ímpar.");
			}
		} else if (a < 0) {
			System.out.println("O valor é negativo.");
			if (a % 2 == 0) {
				System.out.println("O valor é par.");
			} else {
				System.out.println("O valor é ímpar.");
			}
		} else {
			System.out.println("O valor é zero.");
		}
		
		scanner.close();
	}

}