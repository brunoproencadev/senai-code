package atividade;
import java.util.Scanner;

public class Actv5 {
    public static void main(String[] args) {
        var scanner = new Scanner(System.in);
        
        int max = Integer.MIN_VALUE;
        int num;
        boolean digitouNumeroValido = false;

        System.out.println("--- Encontrar o Maior Número ---");
        System.out.println("Digite os números (digite -1 para encerrar):");

        do {
            System.out.print("Digite um número: ");
            num = scanner.nextInt();

            if (num != -1) {
                if (num > max) {
                    max = num;
                }
                digitouNumeroValido = true;
            }
        } while (num != -1);

        System.out.println("\n----------------------------------");
        if (digitouNumeroValido) {
            System.out.println("O maior número digitado foi (max): " + max);
        } else {
            System.out.println("Nenhum número válido foi digitado.");
        }
        System.out.println("----------------------------------");

        scanner.close();
    }
}