package listaExercicios03;

import java.util.Locale;
import java.util.Scanner;

public class L3Ex1 {
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		Locale.setDefault(Locale.US);
		
		System.out.print("Digite um número: ");
		int a = sc.nextInt();
		System.out.print("Digite outro número: ");
		int b = sc.nextInt();
		sc.close();
		
		if(a > b) {
			System.out.println("O primeiro número é maior!");
		} else {
			System.out.println("O segundo número é maior!");
		}
		
	}

}
