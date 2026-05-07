package listaExercícios07;

import java.util.Scanner;

public class L7Ex4 {
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.print("Digite um número inteiro: ");
		int n = sc.nextInt();
		
		for (int i = 1; i <= 10; i++) {
			int multiplicacao = n * i;
			System.out.println(multiplicacao);
		}
	
		sc.close();
	}

}
