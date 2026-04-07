package listaExercícios06;

import java.util.Scanner;

public class L6Ex3 {
	
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.print("Digite a nota final do aluno: ");
		int grade = sc.nextInt();
		
		if (grade < 50) {
			System.out.println("Reprovado");
		} else if (grade <= 69) {
			System.out.println("Recuperação");
		} else if (grade <= 79) {
			System.out.println("Aprovado");
		} else {
			System.out.println("Aprovado com Honra");
		}
		
		sc.close();
	}

}
