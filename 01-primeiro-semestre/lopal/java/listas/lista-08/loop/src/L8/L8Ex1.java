package L8;

import java.util.Locale;
import java.util.Scanner;

public class L8Ex1 {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        Locale.setDefault(Locale.US);

        System.out.print("Enter the base number: ");
        int a  = input.nextInt();
        System.out.print("Enter the exponent: ");
        int b = input.nextInt();

        int c = 1;
        for (int i = 0; i < b; i++) {
            c *= a;
        }
        System.out.println("Result: " + c);

        input.close();
    }
}