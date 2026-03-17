package listaExercicio01;

import java.util.Locale;
import java.util.Scanner;

public class L1Ex2 {
	public static void main(String[] args) {
		
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		System.out.print("Digite um número: ");
		double a = sc.nextDouble();
		System.out.print("Digite outro número: ");
		double b = sc.nextDouble();
		
		double c = a * b;
		
		System.out.printf("\nPRODUTO: %.2f%n", c);
		
	
		sc.close();
	}
}
