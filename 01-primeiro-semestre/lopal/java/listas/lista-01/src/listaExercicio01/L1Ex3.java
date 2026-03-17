package listaExercicio01;

import java.util.Scanner;
import java.util.Locale;

public class L1Ex3 {
	public static void main(String[] args) {
		
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		System.out.print("Digite um número: ");
		int num = sc.nextInt();
		
		int antecessor = num - 1;
		int sucessor = num + 1;
		
		System.out.println(String.format("Antecessor: %d \nSucessor: %d", antecessor, sucessor));
		
		
		sc.close();
	}
}
