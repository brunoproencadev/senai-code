package L8;

import java.util.Locale;
import java.util.Scanner;

public class L8Ex2 {
    public static void main(String[] args) {

        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter your age (01): ");
        int age = sc.nextInt();
        System.out.print("Enter your age (02): ");
        double age2 = sc.nextDouble();
        System.out.print("Enter your age (03): ");
        double age3 = sc.nextDouble();
        System.out.print("Enter your age (04): ");
        double age4 = sc.nextDouble();
        System.out.print("Enter your age (05): ");
        double age5 = sc.nextDouble();

        double mean = (age  + age2 + age3 + age4 + age5) / 5;
        System.out.println("The mean age is: " + mean);

        sc.close();
    }
}
