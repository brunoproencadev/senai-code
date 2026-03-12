package prjAula02;

import java.util.Scanner;
import java.util.Locale; 
import java.lang.Math;

public class Ex5 {
	public static void main(String[] args) {
		
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		System.out.print("Write the base of ur number: ");
		double base = sc.nextDouble();
		System.out.print("\nWrite the exponent: ");
		double exponent = sc.nextDouble();
		
		double result = Math.pow(base, exponent);
		
		System.out.printf("\nResult = %.2f%n", result);
		
		sc.close();
	}
}
