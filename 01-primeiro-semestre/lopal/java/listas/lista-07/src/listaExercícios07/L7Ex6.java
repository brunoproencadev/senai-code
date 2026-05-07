package listaExercícios07;

public class L7Ex6 {
	public static void main(String[] args) {
		
		int sum = 0;
		for (int i =0; i <= 100; i++) {
			if (i % 2 == 0) {
				sum += i;
			}
		}
		
		System.out.println("A soma dos números pares "
				+ "de 1 a 100 é: " + sum);
	}

}
