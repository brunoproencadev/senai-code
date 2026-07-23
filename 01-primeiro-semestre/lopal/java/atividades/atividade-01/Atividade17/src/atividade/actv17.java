package atividade;

import java.util.Scanner;

public class actv17 {
	public static void main(String[] args) {
		var scanner = new Scanner(System.in);
		
		int Francisco = 110;
		int Sarah = 150;
		
		int i = 0;
		while (Francisco < Sarah) {
			Francisco += 3;
			Sarah += 2;
			
			i++;
			}
			
		System.out.println("Francisco ultrapassou Sarah em " + (i + 1) + " anos.");
		
		scanner.close();
		}
	}
