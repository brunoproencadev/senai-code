package atividade;

import java.util.Scanner;

public class Actv7 {
	public static void main(String[] args) {
		var scanner = new Scanner(System.in);
		
		System.out.print("Digite o valor A: ");
		int a = scanner.nextInt();
		System.out.print("Digite o valor B: ");
		int b = scanner.nextInt();
		
		for (int i = 0; i < b; i++) {
			a++;
		}
		
		System.out.print("O valor de A multiplicado por B é: " + a);
		
		scanner.close();
	}

}
