package listaExercicios02;

import java.util.Scanner;
import java.util.Locale;

public class L2Ex6 {
	public static void main(String[] args) {
		
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		System.out.print("Digite o valor total da compra: ");
		double valorTotal = sc.nextDouble();
		System.out.print("Digite o valor pago pelo cliente: ");
		double valorPago = sc.nextDouble();
		
		double troco = valorTotal - valorPago;
		System.out.println(String.format("\nTroco: %.2f%n", troco));
		
		sc.close();
	}
}
