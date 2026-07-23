package atividade;

import java.util.Scanner;

public class Actv3 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        double total = 0.0;
        String continuar = "sim";

        System.out.println("--- Caixa de Produtos ---");

        while (continuar.equalsIgnoreCase("sim") || continuar.equalsIgnoreCase("s")) {
            System.out.print("Digite o preço do produto: R$ ");
            double preco = scanner.nextDouble();
            scanner.nextLine();
            
            total += preco;

            System.out.print("Deseja adicionar mais um produto? (sim/não): ");
            continuar = scanner.nextLine();
        }

        System.out.println("\n----------------------------------");
        System.out.printf("Valor TOTAL dos produtos: R$ %.2f\n", total);
        System.out.println("----------------------------------");

        scanner.close();
    }
}