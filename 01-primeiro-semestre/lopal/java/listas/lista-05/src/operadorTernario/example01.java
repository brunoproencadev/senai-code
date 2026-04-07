package operadorTernario;

import java.util.Locale;
import java.util.Scanner;

public class example01 {
	
	public static void main(String[] args) {
		
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		System.out.print("Digite a sua idade: ");
		int age = sc.nextInt();
		
		System.out.println(age >=18 ? "Adult" : "Teenager");
		
		
		
		
		sc.close();
	}

}
