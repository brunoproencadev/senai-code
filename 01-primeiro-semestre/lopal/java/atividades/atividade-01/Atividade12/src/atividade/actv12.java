package atividade;

import java.util.Scanner;

public class actv12 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Digite o valor do produto: R$ ");
        double valorProduto = scanner.nextDouble();

        System.out.println("Escolha a forma de pagamento:");
        System.out.println("1 - À Vista em Dinheiro ou Pix (15% de desconto)");
        System.out.println("2 - À Vista no cartão de crédito (10% de desconto)");
        System.out.println("3 - Parcelado em 2 vezes (Preço normal)");
        System.out.println("4 - Parcelado em 3 vezes ou mais (10% de juros)");
        System.out.print("Digite o código da condição de pagamento: ");
        int codigo = scanner.nextInt();

        double valorFinal = 0;
        boolean codigoValido = true;

        switch (codigo) {
            case 1:
                valorFinal = valorProduto * 0.85; // 15% de desconto
                break;
            case 2:
                valorFinal = valorProduto * 0.90; // 10% de desconto
                break;
            case 3:
                valorFinal = valorProduto; // Sem juros ou desconto
                break;
            case 4:
                valorFinal = valorProduto * 1.10; // 10% de juros
                break;
            default:
                System.out.println("Código inválido!");
                codigoValido = false;
        }

        if (codigoValido) {
            System.out.printf("O valor final a ser pago é: R$ %.2f\n", valorFinal);
        }

        scanner.close();
    }
}