package listaExercicios03;

import java.util.Scanner;
import java.util.Locale;

public class L3Ex2 {
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		Locale.setDefault(Locale.US);
		
		System.out.print("Digite um número: ");
		int a = sc.nextInt();
		sc.close();
		
		if(a % 2 == 0) {
			System.out.println("Even!");
		} else {
			System.out.println("Odd!");
		}
			
	}
}
