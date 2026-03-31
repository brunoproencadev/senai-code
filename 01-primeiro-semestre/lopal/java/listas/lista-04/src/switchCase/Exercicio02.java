package switchCase;
import java.util.Scanner;
 
public class Exercicio02 {
    public static void main(String[] args) {
    	Scanner scanner = new Scanner(System.in);	
    	
    	System.out.println("Abaixo, você pode ver algumas opções do cardápio disponível para sua escolha:");
    	System.out.println("1 - Margina com Pão");
    	System.out.println("2 - Pão de Batata com Calabresa");
    	System.out.println("3 - Rosquinha Doce");
    	System.out.println("4 - Pão de Queijo");
    	System.out.print("Escolha uma opção com seu teclado (1, 2, 3, 4):");
    	
    	int option = scanner.nextInt();
    	
    	switch(option) {
    	case 1 -> System.out.println("Você escolheu Margarina com Pão\n" + "PREÇO: R$3.00");
    	case 2 -> System.out.println("Você escolheu Pão de Batata com Calabresa\n" + "PREÇO: R$10.00");
    	case 3 -> System.out.println("Você escolheu Rosquinha\n" + "PREÇO: R$8.00");
    	case 4 -> System.out.println("Você escolheu Pão de Queijo\n" + "PREÇO: R$6.00");
    	default ->System.out.println("Opção Inválida");
    	}
    	scanner.close();
    }
}