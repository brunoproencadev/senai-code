package prjAula02;

import java.util.Scanner;
import java.util.Locale;

public class Ex4 {
	public static void main(String[] args) {
		
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		System.out.print("Digite um número decimal: ");
		double num = sc.nextDouble();
		
		System.out.printf("\nNúmero digitado: %.2f%n", num);
		
		sc.close();
	}
}
