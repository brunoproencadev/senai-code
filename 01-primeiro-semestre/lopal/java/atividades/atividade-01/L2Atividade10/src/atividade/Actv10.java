package atividade;

import java.util.Random;
import java.util.Scanner;

public class Actv10 {
    public static void main(String[] args) {
        Random rnd = new Random(); 
        int x = rnd.nextInt(100);  
        
        Scanner scanner = new Scanner(System.in);
        int palpite;

        System.out.println("--- Jogo da Adivinhação (0 a 99) ---");

        do {
            System.out.print("Digite o seu palpite: ");
            palpite = scanner.nextInt();

            if (palpite < x) {
                System.out.println("MAIOR");
            } else if (palpite > x) {
                System.out.println("MENOR");
            } else {
                System.out.println("Parabéns! Você acertou o número oculto: " + x);
            }

        } while (palpite != x);

        scanner.close();
    }
}