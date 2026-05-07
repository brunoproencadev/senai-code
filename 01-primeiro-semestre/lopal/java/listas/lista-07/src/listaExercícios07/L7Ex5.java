package listaExercícios07;

public class L7Ex5 {
	public static void main(String[] args) {
		
		int i = 0;
		int sum = 0;
		while (i <= 100) {
			if (i % 2 == 0) {
				sum += i;
			}
			i++;
		}
		
		System.out.println("A soma dos números pares "
				+ "de 1 a 100 é: " + sum);
	}
	
	

}
