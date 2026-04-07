package listaExercícios06;

import java.util.Locale;
import java.util.Scanner;

public class L6Ex2 {
	
	public static void main(String[] args) {
		
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		System.out.print("Digite a sua renda: R$");
		double income = sc.nextDouble();
		
		double percent = 0.0;
		double finalIncome;
		if (income <= 2000.00) {
			finalIncome = income - percent;
			System.out.println("Income: R$" + income 
					+ "\nIncome Tax: " + "0%" 
					+ "\nFinal income: R$" + finalIncome 
					+ "\nYou are insent!");
		} else if (income <= 5000.00) {
			percent = income * 10 / 100;
			finalIncome = income - percent;
			System.out.println("Income: R$" + income 
					+ "\nIncome Tax: " + "10%" 
					+ "\nFinal income: R$" + finalIncome);
		} else if (income <= 10000.00) {
			percent = income * 20 / 100;
			finalIncome = income - percent;
			System.out.println("Income: R$" + income 
					+ "\nIncome Tax: " + "20%" 
					+ "\nFinal income: R$" + finalIncome);
		} else {
			percent = income * 30 / 100;
			finalIncome = income - percent;
			System.out.println("Income: R$" + income 
					+ "\nIncome Tax: " + "30%" 
					+ "\nFinal income: R$" + finalIncome);
		}
		
		sc.close();
	}

}
