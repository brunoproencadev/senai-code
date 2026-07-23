package atividade;

import java.util.Scanner;

public class actv8 {
	public static void main(String[] args) {
	        var scanner = new Scanner(System.in);
	        
	        System.out.print("Digite o valor 1: ");
	        int a = scanner.nextInt();
	        System.out.print("Digite o valor 2: ");
	        int b = scanner.nextInt();
	        System.out.print("Digite o valor 3: ");
	        int c = scanner.nextInt();
	        
	        System.out.println("Ordem decrescente: ");
	        if (a > b && a > c) {
	            if (b > c) {
	                System.out.println(a + ", " + b + ", " + c);
	            } else {
	                System.out.println(a + ", " + c + ", " + b);
	            }
	        } else if (b > a && b > c) {
	            if (a > c) {
	                System.out.println(b + ", " + a + ", " + c);
	            } else {
	                System.out.println(b + ", " + c + ", " + a);
	            }
	        } else {
	            if (a > b) {
	                System.out.println(c + ", " + a + ", " + b);
	            } else {
	                System.out.println(c + ", " + b + ", " + a);
	            }
	        }
	        
	        scanner.close();
	    }
	}