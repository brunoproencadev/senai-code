package listaExercicio01;

import java.util.Scanner;
import java.util.Locale;
import java.lang.Math;

public class L1Ex1 {
	public static void main(String[] args) {
		
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		System.out.print("Digite a primeira nota do estudante: ");
		double nota1 = sc.nextDouble();
		System.out.print("Digite a segunda nota do estudante: ");
		double nota2 = sc.nextDouble();
		
		double media = (double)(nota1 + nota2) / 2;
		
		System.out.printf("\nMédia final do estudante: %.1f%n", media);
		
		sc.close();
	}
}
