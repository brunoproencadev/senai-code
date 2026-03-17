package listaExercicio01;

import java.util.Scanner;
import java.util.Locale;

public class L1Ex7 {
	public static void main(String[] args) {
		
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		System.out.print("Digite o valor da base do retângulo: ");
		double base = sc.nextDouble();
		System.out.print("Digite o valor da altura do retângulo: ");
		double altura = sc.nextDouble();
		
		double perimetro = (base * 2) + (altura * 2);
		double area = base * altura;
		System.out.println(String.format("Perímetro: %.2f%n Área: %.2f%n", perimetro, area));
		
		sc.close();
	}
}
