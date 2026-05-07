package listaExercícios07;

import java.util.Locale;
import java.util.Scanner;

public class L7Ex3 {
	public static void main(String[] args) {
		
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		System.out.print("Digite um número inteiro: ");
		int n = sc.nextInt();
		
		int i = 0;
		while (i <= 10) {
			int multiplicacao = n * i;
			System.out.println(multiplicacao);
			i++;
		}
	
		sc.close();
	}

}
