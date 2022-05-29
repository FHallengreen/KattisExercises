package coldputerScience;

import java.util.Arrays;
import java.util.Scanner;

public class coldPuter {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        String t = sc.next();

        String[] split = t.split(" ");
        int [] ary = new int[split.length];

        System.out.println(Arrays.toString(ary));

        for (int i = 0; i < split.length; i++) {
            ary[i] = (Integer.parseInt(split[i]));
        }
        System.out.println(Arrays.toString(ary));

      /*  int amount = 0;

        for (int i = 0; i <= n; i++) {
            if (ary[i] < 0){
                amount++;
            }
        }
        System.out.println(amount);
    }*/



}}
