package loop;

import java.util.Scanner;

public class Ex1_while {
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Olá mundo!");
		
		int num = -1000000000;
		while (num < 1000000000) {
			System.out.println(num);
			num++;
		}
		
		//for (int i = 0; i < 11; i++) {
		//	System.out.println(i);
		//}
		
		
		sc.close();
	}

}
