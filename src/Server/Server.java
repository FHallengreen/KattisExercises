package Server;

import java.util.ArrayList;
import java.util.Scanner;

public class Server {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String input = sc.nextLine();

        String[] arr = input.split(" ");
        int n = Integer.parseInt(arr[0]);
        int t = Integer.parseInt(arr[1]);

        int total = 0;
        ArrayList<Integer> ary = new ArrayList<>();

        for (int i = 0; i < n; i++) {
            int tasks = sc.nextInt();
            ary.add(tasks);
        }
        for (int i = 0; i < ary.size(); i++) {
            total += ary.get(i);
            if (total >= t) {
                total -= ary.get(i);
                System.out.println(i);
                break;
            }
        }
    }
}