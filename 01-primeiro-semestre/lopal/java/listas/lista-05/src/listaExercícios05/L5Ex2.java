package listaExercícios05;

import java.util.Locale;
import java.util.Scanner;

public class L5Ex2 {
	
	public static void main(String[] args) {
		
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Escolha a conversão desejada:"
				+ "\n1 - Celcius para Fahrenheit"
				+ "\n2 - Celcius para Kelvin"
				+ "\n3 - Fahrenheit para Celcius"
				+ "\n4 - Fahrenheit para Kelvin"
				+ "\n5 - Kelvin para Celcius"
				+ "\n6 - Kelvin para Fahrenheit");
		
		System.out.print("Digite a opção: ");
		int option = sc.nextInt();
		System.out.print("Digite a temperatura: ");
		double temperature = sc.nextDouble();
		sc.close();
		
		if (option == 1) {
			double f = (temperature * 1.8) + 32;
			System.out.println("Resultado da conversão: " + f);
		} else if (option == 2) {
			double k = temperature + 273.15;
			System.out.println("Resultado da conversão: " + k);
		} else if (option == 3) {
			double c = (temperature - 32) * (5/9);
			System.out.println("Resultado da conversão: " + c);
		} else if (option == 4) {
			double k = ((temperature - 32) / 1.8) + 273.15;
			System.out.println("Resultado da conversão: " + k);
		} else if (option == 5) {
			double c = temperature - 273.15;
			System.out.println("Resultado da conversão: " + c);
		} else {
			double f = (temperature - 273.15) * (9/5) + 32;
			System.out.println("Resultado da conversão: " + f);
		}
		
	}

}
