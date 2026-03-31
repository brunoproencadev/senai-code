package listaExercicios04;

import java.util.Locale;
import java.util.Scanner;

public class L4Ex4 {
	public static void main(String[] args) {
        
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);

        System.out.print("Número 1: ");
        double a = sc.nextInt();
        System.out.print("Número 2: ");
        double b = sc.nextInt();
        System.out.print("Número 3: ");
        double c = sc.nextInt();
        sc.close();
        
        double mean = (a + b + c) / 3.0;
        
        if(mean >= 7) {
        	System.out.println("Média: " + mean);
        	System.out.println("Status: Aprovado!");
        } else if(mean >= 4 && mean <= 7) {
        	System.out.println("Média: " + mean);
        	System.out.println("Status: Recuperação!");
        } else {
        	System.out.println("Média: " + mean);
        	System.out.println("Status: Reprovado!");
        }
        
	}
}