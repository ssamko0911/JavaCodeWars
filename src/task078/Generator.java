package src.task078;

//https://www.codewars.com/kata/593b1909e68ff627c9000186/train/java

import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

class Generator {
    final static private Set<String> VOWELS = new HashSet<String>(
            Arrays.asList("a", "e", "i", "o", "u")
    );
    final static private int NICK_LENGTH_REGULAR = 3;
    final static private String ERROR = "Error: Name too short";

    public static String nickname(String name) {
        if (name.length() <= NICK_LENGTH_REGULAR) {
            return Generator.ERROR;
        }

        if (Generator.VOWELS.contains(Character.toString(name.charAt(Generator.NICK_LENGTH_REGULAR - 1)))) {
            return name.substring(0, Generator.NICK_LENGTH_REGULAR + 1);
        }

        return name.substring(0, Generator.NICK_LENGTH_REGULAR);
    }
}
