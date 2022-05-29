package Reverse;

import java.util.ArrayList;
import java.util.Scanner;

public class Reverse {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        int n = scanner.nextInt();
        int [] ary = new int[n];
        for (int i = 0; i < n; i++) {
            ary[i] = scanner.nextInt();
        }
        for (int j = ary.length -1; j >= 0; j--) {
            System.out.println(ary[j]);
        }
    }
}