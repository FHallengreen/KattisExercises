package qaly;

import java.util.Scanner;

public class qaly {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        double sum = 0;

        for (int i = 0; i < n; i++) {
            double a = sc.nextDouble();
            double b = sc.nextDouble();
            sum +=(b * a);
        }
        System.out.println(sum);
    }
}
