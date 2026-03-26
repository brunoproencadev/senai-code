package listaExercicios03;

import java.util.Scanner;

public class primeNumber {
	public static boolean isPrime(int num) {
		
		//Numbers less or equal one are not even, cus of this I check
		if(num <= 1) {
			return false;
		}
		
		//Check for even numbers greater than 2
		if(num % 2 == 0) {
			return num == 2;
		}
		
		// Only need to check odd divisors up to the square root of num.
        // If a number has a divisor greater than its square root, 
		// it must have a smaller one already checked.
		for(int i = 3; i * i <= num; i += 2) {
			if(num % i == 0) {
				return false;
			}
		}
		
		return true;
	}
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter a number to check: ");
		int inputNumber = sc.nextInt();
		sc.close();
		
		if(isPrime(inputNumber)) {
			System.out.println(inputNumber + " is a prime number :)");
		} else {
			System.out.println(inputNumber + " is not a prime number :(");
		}
		
	}
}