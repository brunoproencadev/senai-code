package listaExercicio01;

import java.util.Scanner;
import java.util.Locale;

public class L1Ex4 {
	public static void main(String[] args) {
		
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		System.out.print("Digite um número real [0.0]");
		double num = sc.nextDouble();
		
		double fracao = num /4;
		System.out.println(String.format("1/4 de %f é %.2f", num, fracao));
		
		sc.close();
	}
}
