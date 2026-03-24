package listaExercicios02;

import java.util.Locale;
import java.util.Scanner;
import java.lang.Math;

public class L2Ex3 {
	public static void main(String[] args) {
		
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		System.out.print("Digite o raio da circunferência em cm: ");
		double r = sc.nextDouble();
		
		double perimetro = 2 * Math.PI * r;
		System.out.println(String.format("Perímetro: %.2fcm %n", perimetro));
		
		sc.close();
	}
}
