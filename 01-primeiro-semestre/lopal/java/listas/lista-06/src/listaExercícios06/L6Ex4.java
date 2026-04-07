package listaExercícios06;

import java.util.Locale;
import java.util.Scanner;

public class L6Ex4 {
	
	public static void main(String[] args) {
		
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		System.out.print("Digite o score da Pessoa Física: ");
		int score = sc.nextInt();
		
		if (score < 400) {
			System.out.println("Alto Risco! \nCrétido Negado!");
		} else if (score <= 699) {
			System.out.println("Risco médio! \nJuros de 10%");
		} else if (score < 850) {
			System.out.println("Baixo Risco! \nJuros de 05%");
		} else {
			System.out.println("Cliente VIP \nJuros de 02%");
		}
		
		
		
		sc.close();
	}

}
