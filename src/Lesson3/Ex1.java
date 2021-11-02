package Lesson3;

import java.util.HashMap;
import java.util.Map;

public class Ex1 {

    public static void main(String[] args) {

        String[] words = new String[20];
        words[0] = "Hi";
        words[1] = "Ok";
        words[2] = "Bb";
        words[3] = "Yesterday";
        words[4] = "Hi";
        words[5] = "Bb";
        words[6] = "Hi";
        words[7] = "Ok";
        words[8] = "Bb";
        words[9] = "Bb";
        words[10] = "Hi";
        words[11] = "Bb";
        words[12] = "Bb";
        words[13] = "Ok";
        words[14] = "Yesterday";
        words[15] = "Yesterday";
        words[16] = "Yesterday";
        words[17] = "Ok";
        words[18] = "Yesterday";
        words[19] = "Bb";

        unicWords(words);

    }

    public static void unicWords(String[] strings) {

        HashMap<String, Integer> unics = new HashMap<>();
        Integer count = 0;
        for (int i = 0; i < strings.length; i++) {
            for (int j = 1; j < strings.length; j++) {
                if (strings[i].equals(strings[j])) {
                    count++;
                }
            }
            unics.put(strings[i], count);
            count = 0;
        }

        for (Map.Entry <String, Integer> e: unics.entrySet())
            System.out.println("Слово " + e.getKey() + " Встречается " + e.getValue() + " раз.");
    }

}
