package listaExercícios07;

public class L7Ex1 {
	public static void main(String[] args) {
		
		int i = 0;
		while (i <= 100) {
			if (i % 2 == 0 && i <= 50) {
				System.out.println(i);
			} else if (i % 2 != 0 && i > 50) {
				System.out.println(i);
			}
			i++;
		}
	}

}
