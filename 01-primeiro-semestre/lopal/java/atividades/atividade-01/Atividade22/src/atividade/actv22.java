package atividade;

import java.util.Scanner;

public class actv22 {
	public static void main(String[] args) {
		var scanner = new Scanner(System.in);
		
		System.out.print("Digite o tempo do trajeto: ");
		int tempo = scanner.nextInt();
		System.out.print("Digite a velocidade média: ");
		int velocidade = scanner.nextInt();
		
		int distancia = tempo * velocidade;
		double litros = distancia / 12.0;
		
		System.out.println("O consumo de combustível é: " + litros + " litros");
		System.out.println("A distância percorrida é: " + distancia + " km");
		System.out.println("O tempo gasto no trajeto é: " + tempo + " horas");
		System.out.println("A velocidade média é: " + velocidade + " km/h");
		
		scanner.close();
		}
	}

