package stringToHistogram;

import java.util.ArrayList;
import java.util.HashMap;

public class Main {
    public static void main(String[] args) {

        String input = "Hej jeg hedder hans du";

        String longestWord = "";
        ArrayList<Integer> wordLength = new ArrayList<>();

        String[] findLongestWord = input.split(" ");
        for (int i = 0; i < findLongestWord.length; i++) {
            wordLength.add(findLongestWord[i].length());
            if (findLongestWord[i].length() > longestWord.length()) {
                longestWord = findLongestWord[i];
            }
        }
        System.out.println(wordLength);
        int hi = 0;

        for (int i = 1; i <= longestWord.length(); i++) {
            ArrayList<String> arraylist = new ArrayList<>();
            if (wordLength.contains(i)) {
                hi++;
                arraylist.add(i + ":" + hi);
            } else arraylist.add(i + ":" + hi);
            System.out.println(arraylist);
            hi = 0;
        }
    }
}
