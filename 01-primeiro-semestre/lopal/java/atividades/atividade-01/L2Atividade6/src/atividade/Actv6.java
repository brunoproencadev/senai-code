package atividade;

import java.util.Scanner;

public class Actv6 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        double somaSalarios = 0.0;
        double maiorSalario = -Double.MAX_VALUE;
        double menorSalario = Double.MAX_VALUE;

        System.out.println("--- Sistema de Relatório Salarial ---");
        System.out.print("Digite a quantidade de funcionários da empresa: ");
        int quantidadeFuncionarios = scanner.nextInt();

        for (int i = 1; i <= quantidadeFuncionarios; i++) {
            System.out.print("Digite o salário do " + i + "º funcionário: R$ ");
            double salario = scanner.nextDouble();

            somaSalarios += salario;

            if (salario > maiorSalario) {
                maiorSalario = salario;
            }

            if (salario < menorSalario) {
                menorSalario = salario;
            }
        }

        System.out.println("\n=================================");
        System.out.println("       RELATÓRIO SALARIAL        ");
        System.out.println("=================================");
        
        if (quantidadeFuncionarios > 0) {
            double mediaSalarial = somaSalarios / quantidadeFuncionarios;
            System.out.printf("Média Salarial: R$ %.2f\n", mediaSalarial);
            System.out.printf("Salário mais ALTO: R$ %.2f\n", maiorSalario);
            System.out.printf("Salário mais BAIXO: R$ %.2f\n", menorSalario);
        } else {
            System.out.println("Nenhum funcionário foi cadastrado para gerar relatório.");
        }
        
        System.out.println("=================================");

        scanner.close();
    }
}