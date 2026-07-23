package atividades;

import java.util.Scanner;

public class actv4 {
	public static void main(String[] args) {
		var scanner = new Scanner(System.in);
		
		System.out.print("Digite o valor A: ");
		int a = scanner.nextInt();
		
		int predecessor = a - 1;
		int successor = a + 1;
		
		System.out.println("O predecessor de " + a + " é: " + predecessor);
		System.out.println("O sucessor de " + a + " é: " + successor);
		
		scanner.close();
	}

}

