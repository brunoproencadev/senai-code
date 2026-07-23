package atividade;

import java.util.Scanner;

public class actv20 {
	public static void main(String[] args) {
		var scanner = new Scanner(System.in);
		
		System.out.print("Digite o valor A: ");
		int a = scanner.nextInt();
		System.out.print("Digite o valor B: ");
		int b = scanner.nextInt();
		
		System.out.print("Quociente da divisão inteira de A por B: " + (a / b));
		System.out.print("\nResto da divisão inteira de A por B: " + (a % b));
		
		scanner.close();
	}

}
