package listaExercicios02;

import java.util.Locale;
import java.util.Scanner;

public class L2Ex5 {
	public static void main(String[] args) {
		
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		System.out.print("Digite a temperatura em celcius: ");
		double c = sc.nextDouble();
		
		double f = (c * (9.0/5.0)) + 32;
		System.out.println(String.format("Graus Farenheit: %.2f%n", f));
		
		sc.close();
	}
}
