package listaExercícios05;

import java.util.Locale;
import java.util.Scanner;

public class L5Ex3 {
	
	public static void main(String[] args) {
		
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		System.out.print("Digite o número do mês (1/12): ");
		int month = sc.nextInt();
		System.out.print("Escolha o emisfério (N - Norte; S - Sul): ");
		char pole = sc.next().toUpperCase().charAt(0);
		sc.close();
		
		if (pole == 'N') {
			if (month >= 3 && month < 6) {
				System.out.println("Estação do ano: Spring");
			} else if (month >= 6 && month < 9) {
				System.out.println("Estação do ano: Summer");
			} else if (month >= 9 && month < 12) {
				System.out.println("Estação do ano: Fall");
			} else {
				System.out.println("Estação do ano: Winter");
			}
		} else {
			if (month >= 3 && month < 6) {
				System.out.println("Estação do ano: Summer");
			} else if (month >= 6 && month < 9) {
				System.out.println("Estação do ano: Fall");
			} else if (month >= 9 && month < 12) {
				System.out.println("Estação do ano: Winter");
			} else {
				System.out.println("Estação do ano: Spring");
			}
		}
	}
}
