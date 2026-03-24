package listaExercicios02;

import java.util.Locale;
import java.util.Scanner;

public class L2Ex1 {
	public static void main(String[] args) {
		
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		System.out.print("Digite um número: ");
		double a = sc.nextDouble();
		System.out.print("Digite outro número: ");
		double b = sc.nextDouble();
		
		double sum = a + b;
		double sub = a - b;
		double multi = a * b;
		double div = a / b;
		System.out.println(String.format("\nSoma: %.2f%nSubtração: %.2f%nMultiplicação: %.2f%nDivisão: %.2f%n", sum, sub, multi, div));
		
		sc.close();
	}
}
