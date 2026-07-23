package atividade;

import java.util.Scanner;

public class Actv1 {
	public static void main(String[] args) {
		var scanner = new Scanner(System.in);
		
		int numero = scanner.nextInt();			
		while (numero != 0) {
			System.out.println(numero);
			numero = scanner.nextInt();
		}
		
		scanner.close();
	}

}
