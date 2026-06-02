package L8;

import java.util.Locale;
import java.util.Scanner;

public class L8Ex4 {
    public static void main(String[] args) {

        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

//        int i = 1;
//        int cont = 0;
//        do {
//            System.out.print("Number " + " " + i + ": ");
//            double n = sc.nextDouble();
//
//            if (n >= 0 && n <= 100) {
//                cont++;
//            }
//            i++;
//        } while (i <= 10);
//
//        System.out.println("Result: " + cont);

        int cont = 0;
        for (int i = 1; i <=10; i++) {
            System.out.print("Number " + " " + i + ": ");
            int n = sc.nextInt();

            if (n >= 0 && n <= 100) {
                cont++;
            }
        }

        System.out.println("Result: " + cont);

        sc.close();
    }
}