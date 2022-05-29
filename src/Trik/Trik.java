package Trik;

import java.util.Scanner;

public class Trik {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int value = 0;
        String abc = sc.nextLine().toUpperCase();

        if (abc.charAt(0) == 'A') {
            value = 2;
        } else if (abc.charAt(0) == 'B') {
            value = 1;
        } else if (abc.charAt(0) == 'C') {
            value = 3;
        }

        for (int i = 1; i < abc.length(); i++) {
            if (abc.charAt(i) == 'A' && value == 1) {
                value = 2;
            } else if (abc.charAt(i) == 'A' && value == 2) {
                value = 1;
            } else if (abc.charAt(i) == 'B' && value == 2) {
                value = 3;
            } else if (abc.charAt(i) == 'B' && value == 3) {
                value = 2;
            } else if (abc.charAt(i) == 'C' && value == 3) {
                value = 1;
            } else if (abc.charAt(i) == 'C' && value == 1) {
                value = 3;
            }
        }
        System.out.println(value);
    }
}