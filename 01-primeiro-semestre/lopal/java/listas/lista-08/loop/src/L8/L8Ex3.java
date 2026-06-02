package L8;

import java.util.Locale;
import java.util.Scanner;

public class L8Ex3 {
    public static void main(String[] args) {

        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

//        int cont = 0;
//        int i = 1;
//        final int target = 10;
//        do {
//            System.out.print("Enter a number" + " " + i + ": ");
//            double num = sc.nextDouble();
//            if (num > target) {
//                cont++;
//            }
//            i++;
//        } while (i <= 20);

        int cont = 0;
        final int target = 10;
        for (int i = 1; i <=20; i++){
            System.out.print("Enter the number " + i + ": ");
            int num = sc.nextInt();

            if (num < target){
                cont++;
            }
        }

        System.out.println("\nQuantidade de números maiores que " + target + ": " + cont);
        sc.close();
    }
}