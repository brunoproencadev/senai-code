package atividade;

import java.util.Scanner;

public class actv18 {
	public static void main(String[] args) {
		var scanner = new Scanner(System.in);
		
		System.out.print("Digite o valor do número que deseia saber a tabuada: ");
		int a = scanner.nextInt();
		
		for (int i = 1; i <= 10; i++) {
			int resultado = a * i;
			System.out.println(a + " x " + i + " = " + resultado);
		}
		
		scanner.close();
	}

}
