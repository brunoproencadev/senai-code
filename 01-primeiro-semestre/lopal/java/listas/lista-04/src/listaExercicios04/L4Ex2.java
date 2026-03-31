	package listaExercicios04;

import java.util.Scanner;
import java.util.Locale;

public class L4Ex2 {
	public static void main(String[] args) {
		
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		System.out.print("Digite um número: ");
		double a = sc.nextInt();
		System.out.print("Digite outro número: ");
		double b = sc.nextInt();
		System.out.print("Digite outro número: ");
		double c = sc.nextInt();
		sc.close();
		
		if(a + b + c < 0) {
			System.out.println("A soma é negativa!");
		} else if(a + b + c == 0) {
			System.out.println("A soma é igual a zero!");
		} else {
			System.out.println("A soma é positiva!");
		}
		
	}
}