package listaExercícios05;

import java.util.Locale;
import java.util.Scanner;

public class L5Ex1 {
	static void divisoria() {
		System.out.println("******************************");
	}
	static void header() {
		System.out.println("**********CALCULATOR**********");
	}
	public static void main(String[] args) {
		
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		header();
		System.out.println("\n1 - Adição"
				+ "\n2 - Subtração"
				+ "\n3 - Multiplicação"
				+ "\n4 - Divisão\n");
		divisoria();
		
		System.out.print("\nDigite o número da opção desejada: ");
		int option = sc.nextInt();
		System.out.println();
		divisoria();
		
		System.out.print("\nDigite o primeiro número: ");
		int a = sc.nextInt();
		System.out.print("Digite o segundo número: ");
		int b = sc.nextInt();
		System.out.println();
		divisoria();
		
		int assign;
		if (option == 1) {
			assign = a + b;
			System.out.println("\nResultado da soma: " + assign + "\n");
		} else if (option == 2) {
			assign = a - b;
			System.out.println("\nResultado da subtração: " + assign + "\n");
		} else if (option == 3) {
			assign = a * b;
			System.out.println("\nResultado da multiplicação: " + assign + "\n");
		} else {
			if (b == 0) {
				System.out.println("\nError: Division by zero!\n");
			} else {
			assign = a / b;
			System.out.println("\nResultado da divisão (inteiro): " + assign + "\n");
			}
		}
		divisoria();
		
		sc.close();
	}

}