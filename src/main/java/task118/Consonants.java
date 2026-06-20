package task118;

//https://www.codewars.com/kata/564e7fc20f0b53eb02000106/train/java

import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class Consonants {
    public static final Set<Character> EXCLUDE = new HashSet<>(List.of('a', 'e', 'i', 'o', 'u'));

    public static int getCount(String str) {
        int charCount = 0;

        for (int i = 0; i < str.length(); i++) {
            if (Character.isLetter(str.charAt(i))) {
                if (!EXCLUDE.contains(str.charAt(i))) {
                    charCount++;
                }
            }
        }

        return charCount;
    }
}
