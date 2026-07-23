package atividade;

import java.util.Scanner;

public class actv10 {
	public static void main(String[] args) {
		var scanner = new Scanner(System.in);
		
		System.out.print("Digite a nota #01 do aluno: ");
		double nota1 = scanner.nextDouble();
		System.out.print("Digite a nota #02 do aluno: ");
		double nota2 = scanner.nextDouble();
		System.out.print("Digite a nota #03 do aluno: ");
		double nota3 = scanner.nextDouble();
		
		double media = (nota1 + nota2 + nota3) / 3;
		
		System.out.printf("A média do aluno é: %.2f%n", media);
		
		scanner.close();
	}

}
