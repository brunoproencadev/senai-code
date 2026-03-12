package prjAula02;

import java.util.Scanner;
import java.util.Locale;
import java.lang.Math;

public class Ex2 {
	public static void main(String[] args) {
		
		Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);
        
        System.out.print("Input ur 1st name: ");
        String name = sc.next();
        System.out.print("Input ur 2nd name: ");
        String lastName = sc.next();
        
        String fullName = name + " " + lastName;
        
        System.out.printf("\n Your full name is: %s", fullName);
        
	}
}
