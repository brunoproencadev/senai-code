package listaExercicios03;

import java.util.Scanner;
import java.util.Locale;

public class L3Ex4 {
	public static void main(String[] args) {
		
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		System.out.print("Digite a nota 1: ");
		double a = sc.nextDouble();
		System.out.print("Digite a nota 2: ");
		double b = sc.nextDouble();
		
		double c = (a + b) / 2.0;
		if(c >= 6.0) {
			System.out.println(String.format("Média: %.1f", c));
			System.out.println("Approved");
		} else {
			System.out.println(String.format("Média: %.1f", c));
			System.out.println("Reproved");
		}
		sc.close();	
	}

}
