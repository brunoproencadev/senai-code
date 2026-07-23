package atividade;

import java.util.Scanner;

public class actv12p1 {
	public static void main(String[] args) {
		var scanner = new Scanner(System.in);
		
		
		System.out.print("Digite o seu nome: ");
		String nome = scanner.nextLine();
		System.out.print("Digite a sua idade: ");
		int idade = scanner.nextInt();
		
		if (idade >= 18) {
			System.out.println(nome + ", você é maior de idade.");
		} else {
			System.out.println(nome + ", você é menor de idade.");
		}
		
		scanner.close();
	}
}
