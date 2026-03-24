package listaExercicios02;

import java.util.Locale;
import java.util.Scanner;
import java.lang.Math;

public class L2Ex2 {
	public static void main(String[] args) {
		
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		System.out.print("Digite um número: ");
		double a = sc.nextDouble();
		System.out.print("Digite um segundo número: ");
		double b = sc.nextDouble();
		System.out.print("Digite um terceiro número: ");
		double c = sc.nextDouble();
		
		double geometricMean = Math.pow(a * b * c, 1.0/3.0);
		System.out.println(String.format("\nMédia Geométrica: %.2f%n", geometricMean));
		
		sc.close();
	}
}