package listaExercicios02;

import java.util.Scanner;
import java.util.Locale;
import java.lang.Math;

public class L2Ex4 {
	public static void main(String[] args) {
		
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		System.out.print("Digite o raio da circunferência em mm: ");
		double r = sc.nextDouble();
		
		double area = Math.PI * Math.pow(r, 2);
		System.out.println(String.format("Área: %.2f%n", area, "mm"));
		
		sc.close();
	}
}
