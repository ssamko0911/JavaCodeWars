import java.util.*;

//https://www.codewars.com/kata/52efefcbcdf57161d4000091/java

public class Kata {
    public static Map<Character, Integer> count(String str) {
        Map<Character, Integer> map = new LinkedHashMap<>();

        for (char character : str.toCharArray()) {
            map.put(character, map.getOrDefault(character, 0) + 1);
        }

        return map;
    }
}
