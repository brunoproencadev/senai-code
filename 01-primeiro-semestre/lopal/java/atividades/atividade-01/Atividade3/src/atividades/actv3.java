package atividades;

import java.util.Scanner;

public class actv3 {
	public static void main(String[] args) {
		var scanner = new Scanner(System.in);
		
		System.out.print("Digite o valor A: ");
		int a = scanner.nextInt();
		System.out.print("Digite o valor B: ");
		int b = scanner.nextInt();
		
		int sum = 0, mult = 0, c = 0;
		if (a == b) {
			sum = a + b;
			c = sum;
		} else {
			mult = a * b;
			c = mult;
		}
		
		System.out.print(c);
		
		scanner.close();
	}

}
