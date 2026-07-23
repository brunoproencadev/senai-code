package atividade;

import java.util.Scanner;

public class actv14 {
	public static void main(String[] args) {
		var scanner = new Scanner(System.in);
		
		System.out.print("Digite o valor A: ");
		int a = scanner.nextInt();
		System.out.print("Digite o valor B: ");
		int b = scanner.nextInt();
		
		System.out.print("Troque o valor de A por B e o valor de B por A e imprima: ");
		
		int temp = a;
		a = b;
		b = temp;
		
		System.out.println("O valor de A é: " + a);
		System.out.println("O valor de B é: " + b);
		
		
		scanner.close();
	}

}
