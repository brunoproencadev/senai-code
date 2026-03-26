package listaExercicios03;

import java.util.Locale;
import java.util.Scanner;

public class L3Ex3 {
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		Locale.setDefault(Locale.US);
		
		System.out.print("Digite um número: ");
		double a = sc.nextDouble();
		sc.close();
		
		if(a < 0) {
			System.out.println("O número é negativo!");
		} else if(a == 0) {
			System.out.println("O número é zero!");
		} else {
			System.out.println("O número é positivo!");
		}
		
	}
}
