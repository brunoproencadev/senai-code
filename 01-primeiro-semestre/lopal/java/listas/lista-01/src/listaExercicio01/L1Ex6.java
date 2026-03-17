package listaExercicio01;

import java.util.Scanner;
import java.util.Locale;

public class L1Ex6 {
	public static void main(String[] args) {
		
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		System.out.print("Digite o valor do lado do quadrado: ");
		double lado = sc.nextDouble();
		
		double perimetro = lado * 4;
		double area = lado * lado;
		
		System.out.println(String.format("Perímetro: %.2f%n Área: %.2f%n", perimetro, area));
		
		sc.close();
	}
}
