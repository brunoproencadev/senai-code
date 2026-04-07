package switchCase;

import java.util.Locale;
import java.util.Scanner;

public class L5Ex3 {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        System.out.print("Digite o número do mês (1/12): ");
        int month = sc.nextInt();
        System.out.print("Escolha o hemisfério (N - Norte; S - Sul): ");
        char pole = sc.next().toUpperCase().charAt(0);
        sc.close();

        String season = switch (pole) {
            case 'N' -> switch (month) {
                case 3, 4, 5 -> "Spring";
                case 6, 7, 8 -> "Summer";
                case 9, 10, 11 -> "Fall";
                default -> "Winter";
            };
            case 'S' -> switch (month) {
                case 3, 4, 5 -> "Summer";
                case 6, 7, 8 -> "Fall";
                case 9, 10, 11 -> "Winter";
                default -> "Spring";
            };
            default -> "Hemisfério Inválido";
        };

        System.out.println("Estação do ano: " + season);
    }
}