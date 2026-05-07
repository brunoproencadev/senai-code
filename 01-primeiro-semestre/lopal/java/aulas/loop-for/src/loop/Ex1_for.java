package loop;

public class Ex1_for {
	
	public static void main(String[] args) throws InterruptedException {
		
		// int sum = 0;
		for(int i = 0; i <= 10; i++) {
			if (i <= 9) {
			System.out.println("Contando: " + i + "...");
			} else {
				System.out.println("Contando: " + i + "!");
			}
			Thread.sleep(1000); // 1 segundo
		}

		
	}

}
