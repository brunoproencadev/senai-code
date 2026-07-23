package atividade;

import java.util.Scanner;

public class Actv4 {
	public static void main(String[] args) {
		var scanner = new Scanner(System.in);
		
		int numero = 0;
		int soma = 0;
		do {
			System.out.print("Digite um número inteiro positivo: ");
			numero = scanner.nextInt();
			soma += numero;
		} while (numero == -1);
		
		System.out.println("A soma dos números digitados é: " + soma);
		
		scanner.close();
	}

}
