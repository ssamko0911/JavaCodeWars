package task086;

//https://www.codewars.com/kata/55805ab490c73741b7000064/train/java

import java.util.HashMap;
import java.util.Map;

public class Backronym {
    // dummy variable
    private static Map<String, String> dictionary = new HashMap<>();

    public static String makeBackronym(String acronym) {
        char[] keys = acronym.toCharArray();
        String[] words = new String[keys.length];

        for (int i = 0; i < keys.length; i++) {
            String keyAsString = String.valueOf(keys[i]).toUpperCase();
            if (dictionary.containsKey(keyAsString)) {
                words[i] = (dictionary.get(keyAsString));
            }
        }

        return String.join(" ", words);
    }
}
