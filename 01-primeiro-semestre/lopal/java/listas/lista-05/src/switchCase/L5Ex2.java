package switchCase;

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
		
		switch (option) {
		
		case 1: 
			double f = (temperature * 1.8) + 32;
			System.out.println("Resultado da conversão: " + f);
			break;
		
		case 2:
			double k = temperature + 273.15;
			System.out.println("Resultado da conversão: " + k);
			break;
			
		case 3:
			double c = (temperature - 32) * (5/9);
			System.out.println("Resultado da conversão: " + c);
			break;
			
		case 4:
			double k1 = ((temperature - 32) / 1.8) + 273.15;
			System.out.println("Resultado da conversão: " + k1);
			break;
			
		case 5: 
			double c1 = temperature - 273.15;
			System.out.println("Resultado da conversão: " + c1);
			break;
			
		case 6:
			double f1 = (temperature - 273.15) * (9/5) + 32;
			System.out.println("Resultado da conversão: " + f1);
			break;
			
		default:
			System.out.println("Opção Inválida!");
			break;
		}
		
	}

}
