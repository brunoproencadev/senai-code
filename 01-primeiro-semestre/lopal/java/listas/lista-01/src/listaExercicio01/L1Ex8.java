package listaExercicio01;

import java.util.Scanner;
import java.util.Locale;

public class L1Ex8 {
	public static void main(String[] args) {
		
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		double salarioMinimo = 1640.0;
		
		System.out.print("Digite o valor do seu salário: ");
		double salario = sc.nextDouble();
		
		double amount = salario / salarioMinimo;
		System.out.println(String.format("Você recebeu um total de %.2f salários mínimos.", amount));
		
		sc.close();
	}
}
