package NumberFun;

import java.util.Scanner;

public class NumberFun {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

        for (int i = 0; i < n; i++) {
            double a = sc.nextInt();
            double b = sc.nextInt();
            int c = sc.nextInt();

            if (a  + b == c || a - b == c || a * b == c || a / b == c || b - a == c || b / a == c){
                System.out.println("Possible");
            }
            else System.out.println("Impossible");
        }
    }
}
