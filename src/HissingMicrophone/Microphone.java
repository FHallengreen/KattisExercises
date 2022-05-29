package HissingMicrophone;

import java.util.Scanner;

public class Microphone {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String hiss = sc.nextLine();

        if (hiss.contains("ss")){
            System.out.println("hiss");
        }
        else System.out.println("no hiss");

    }
}
