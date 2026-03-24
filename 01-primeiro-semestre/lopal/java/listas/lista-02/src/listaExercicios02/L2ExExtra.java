package listaExercicios02;

import java.util.Scanner;
import java.util.Locale;
import java.lang.Math;

public class L2ExExtra {
	static void divisoria() {
		System.out.println("******************************");
	}
	
	public static void main(String[] args) {
		
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		divisoria();
		System.out.println("CALCULADORA DE FIGURAS PLANAS");
		divisoria();
		
		System.out.println("TRIÂNGULO - ÁREA");
		System.out.print("Digite a base (cm): ");
		double bTriangulo = sc.nextDouble();
		System.out.print("Digite a altura(cm): ");
		double hTriangulo = sc.nextDouble();
		divisoria();
		
		System.out.println("TRAPÉZIO - ÁREA");
		System.out.print("Digite a base menor(cm): ");
		double bTrapezio = sc.nextDouble();
		System.out.print("Digite a base maior(cm): ");
		double BTrapezio = sc.nextDouble();
		System.out.print("Digite a altura(cm): ");
		double hTrapezio = sc.nextDouble();
		divisoria();
		
		System.out.println("LOSANGO - ÁREA");
		System.out.print("Digite a digonal menor(cm): ");
		double dLosango = sc.nextDouble();
		System.out.print("Digite a diagonal maior(cm): ");
		double DLosango = sc.nextDouble();
		divisoria();
		
		double aTriangulo = (bTriangulo * hTriangulo) / 2.0;
		double aTrapezio = ((BTrapezio + bTrapezio) * hTrapezio) / 2.0;
		double aLosango = (DLosango * dLosango) / 2;
		System.out.println("RESULTADOS");
		divisoria();
		System.out.println(String.format("TRIÂNGULO (cm2): %.2f%nTRAPÉZIO (cm2): %.2f%nLOSANGO (cm2): %.2f%n", aTriangulo, aTrapezio, aLosango));
		divisoria();
		
		sc.close();
	}
	
} 
