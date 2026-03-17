package listaExercicio01;

import java.util.Scanner;
import java.util.Locale;

public class L1Ex5 {
	public static void main(String[] args) {
		
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		System.out.print("Digite um número: ");
		int num = sc.nextInt();
		
		int produto = num * 3;
		System.out.println(String.format("O triplo de %d é %d%n", num, produto));
		
		sc.close();
	}
}
