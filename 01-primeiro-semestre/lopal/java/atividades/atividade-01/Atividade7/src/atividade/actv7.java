package atividade;

import java.util.Scanner;

public class actv7 {
	public static void main(String[] args) {
		var scanner = new Scanner(System.in);

	        System.out.print("Digite o primeiro valor (true ou false): ");
	        boolean valor1 = scanner.nextBoolean();

	        System.out.print("Digite o segundo valor (true ou false): ");
	        boolean valor2 = scanner.nextBoolean();

	        if (valor1 && valor2) {
	            System.out.println("Ambos são VERDADEIRO.");
	        } else if (!valor1 && !valor2) {
	            System.out.println("Ambos são FALSO.");
	        } else {
	            System.out.println("Os valores são diferentes (um é verdadeiro e o outro é falso).");
	        }

	        scanner.close();
	    }
	}

