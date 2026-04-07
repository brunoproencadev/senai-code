package listaExercícios06;

import java.util.Locale;
import java.util.Scanner;

public class L6Ex1 {
	
	public static void main(String[] args) {
		
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		System.out.print("Digite sua idade: ");
		int age = sc.nextInt();
		
		if (age <= 12) {
			System.out.println("Infantil");
		} else if (age <= 17) {
			System.out.println("Juvenil");
		} else if (age <= 40) {
			System.out.println("Adulto");
		} else {
			System.out.println("Master");
		}
		
		
		
		sc.close();
	}

}
