package atividade;

public class Actv8 {
	public static void main(String[] args) {
		System.out.println("Tabuada do 1 ao 10:");
		
		for (int i = 1; i <= 10; i++) {
			System.out.println("Tabuada do " + i + ":");
			for (int j = 1; j <= 10; j++) {
				int resultado = i * j;
				System.out.println(i + " x " + j + " = " + resultado);
			}
			System.out.println();
		}
	}

}
