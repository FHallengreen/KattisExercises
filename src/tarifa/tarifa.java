package tarifa;

import java.util.Scanner;

public class tarifa {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int x = sc.nextInt();
        int n = sc.nextInt();
        int toSpare = 0;
        int sum = 0;
        for (int i = 0; i < n; i++) {
            int p = sc.nextInt();
            if (p < x){
                toSpare += x-p;
                sum += x-p;
            }
            else if (p > x && toSpare < x - p) {
                sum -= p - x;

            }
        }
        System.out.println(sum + 10);
    }
}
