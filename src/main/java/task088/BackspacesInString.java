package task088;

//https://www.codewars.com/kata/5727bb0fe81185ae62000ae3/train/java

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class BackspacesInString {
    public static final char BACKSPACE = '#';

    public String cleanString(String str) {
        if (str.isEmpty()) {
            return str;
        }

        List<Character> characters = new ArrayList<>();

        for (char c : str.toCharArray()) {
            if (c != BackspacesInString.BACKSPACE) {
                characters.add(c);
            } else  {
                if (!characters.isEmpty()) {
                    characters.remove(characters.size() - 1);
                }
            }
        }

        return characters.stream()
                .map(String::valueOf)
                .collect(Collectors.joining());
    }
}
