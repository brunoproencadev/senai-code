package aula01;
import java.util.Scanner;

public class ex1 {
	public static void main(String[] args) {
		// Biblioteca de entrada de dados
		Scanner ler = new Scanner(System.in);
		
		// Declaração das variáveis
		// int soma, num1, num 2
		int numero1;
		int numero2;
		int soma;
		
		// Entrada de dados
		System.out.print("Digite o primeiro número: ");
		numero1 = ler.nextInt();
		System.out.print("Digite o segundo número: ");
		numero2 = ler.nextInt();
		
		// Processamento/Atribuição
		soma = numero1 + numero2;
		// Saída de dados
		System.out.println("Soma: " + soma);
		
		ler.close();
	}
}
