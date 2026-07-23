package ativiades;
import java.util.Scanner;

public class actv6 {
	    public static void main(String[] args) {
	        var scanner = new Scanner(System.in);
	        
	        System.out.print("Digite um valor qualquer: ");
	        double valorOriginal = scanner.nextDouble();
	        
	        double valorReajustado = valorOriginal * 1.05;
	        
	        System.out.printf("Valor com reajuste de 5%%: %.2f%n", valorReajustado);
	        
	        scanner.close();
	    }
}
