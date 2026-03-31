package listaExercicios04;

import java.util.Scanner;
import java.util.Locale;

public class L4Ex1 {
	public static void main(String[] args) {
		
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		System.out.print("Digite um número: ");
		int a = sc.nextInt();
		System.out.print("Digite outro número: ");
		int b = sc.nextInt();
		System.out.print("Digite outro número: ");
		int c = sc.nextInt();
		sc.close();
		
		if(a + b + c % 5 == 0) {
			System.out.println("A soma é divisível por cinco!");
		} else {
			System.out.println("A soma não é divisível por cinco!");
		}
		
		
	}
}
