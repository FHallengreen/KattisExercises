package coldputerScience;

import java.util.Scanner;

public class cold {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();

        int amount = 0;

        for (int i = 0; i < n; i++) {
            int a = sc.nextInt();
            if (a < 0) {
                amount++;
            }
        }
        System.out.println(amount);

    }
}
