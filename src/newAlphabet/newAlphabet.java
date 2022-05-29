package newAlphabet;

import java.util.Scanner;

public class newAlphabet {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        String word = sc.nextLine().toLowerCase();

        for (int i = 0; i < word.length(); i++) {
            if (word.charAt(i) == 'a') {
                System.out.print("@");
            } else if (word.charAt(i) == 'b') {
                System.out.print("8");
            } else if (word.charAt(i) == 'c') {
                System.out.print("(");
            } else if (word.charAt(i) == 'd') {
                System.out.print("|)");
            } else if (word.charAt(i) == 'e') {
                System.out.print("3");
            } else if (word.charAt(i) == 'f') {
                System.out.print("#");
            } else if (word.charAt(i) == 'g') {
                System.out.print("6");
            } else if (word.charAt(i) == 'h') {
                System.out.print("[-]");
            } else if (word.charAt(i) == 'i') {
                System.out.print("|");
            } else if (word.charAt(i) == 'j') {
                System.out.print("_|");
            } else if (word.charAt(i) == 'k') {
                System.out.print("|<");
            }else if (word.charAt(i) == 'l') {
                System.out.print("1");
            }else if (word.charAt(i) == 'm') {
                System.out.print("[]\\/[]");
            }else if (word.charAt(i) == 'n') {
                System.out.print("[]\\[]");
            }else if (word.charAt(i) == 'o') {
                System.out.print("0");
            }else if (word.charAt(i) == 'p') {
                System.out.print("|D");
            }else if (word.charAt(i) == 'q') {
                System.out.print("(,)");
            }else if (word.charAt(i) == 'r') {
                System.out.print("|Z");
            }else if (word.charAt(i) == 's') {
                System.out.print("$");
            }else if (word.charAt(i) == 't') {
                System.out.print("']['");
            }else if (word.charAt(i) == 'u') {
                System.out.print("|_|");
            }else if (word.charAt(i) == 'v') {
                System.out.print("\\/");
            }else if (word.charAt(i) == 'w') {
                System.out.print("\\/\\/");
            }else if (word.charAt(i) == 'x') {
                System.out.print("}{");
            }else if (word.charAt(i) == 'y') {
                System.out.print("`/");
            }else if (word.charAt(i) == 'z') {
                System.out.print("2");
            }
            else if (word.charAt(i) == ' '){
                System.out.print(" ");
            }
            else System.out.print(word.charAt(i));
        }
    }
}
