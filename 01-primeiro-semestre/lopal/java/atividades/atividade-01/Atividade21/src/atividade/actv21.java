package atividade;

import java.util.Scanner;

public class actv21 {
	public static void main(String[] args) {
		var scanner = new Scanner(System.in);
		
		System.out.print("Informe o valor da hora da aula: ");
		double valorHoraAula = scanner.nextDouble();
		System.out.print("Informe a quantidade de aulas dadas: ");
		int quantidadeAulas = scanner.nextInt();
		
		double salarioBruto = valorHoraAula * quantidadeAulas;
		
		double aliquotaINSS = 0;
		double parcelaaDeduzir = 0;
		if (salarioBruto <= 1621) {
			aliquotaINSS = 7.5;
		} else if (salarioBruto <= 2902.84) {
			aliquotaINSS = 9;
			parcelaaDeduzir = 24.32;
		} else if (salarioBruto <= 4354.27) {
			aliquotaINSS = 12;
			parcelaaDeduzir = 111.40;
		} else {
			aliquotaINSS = 14;
			parcelaaDeduzir = 198.49;
		}
		
		double desconto = (salarioBruto * aliquotaINSS) - parcelaaDeduzir;
		double salarioLiquido = salarioBruto - desconto;
		
		System.out.println("Salário bruto: R$ " + salarioBruto);
		System.out.println("Desconto: R$ " + desconto);
		System.out.println("Salário líquido: R$ " + salarioLiquido);
			
		scanner.close();
	}

}
