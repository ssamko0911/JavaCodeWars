package task087;

//https://www.codewars.com/kata/57a6633153ba33189e000074/train/java

import java.util.*;
import org.apache.commons.lang3.tuple.Pair;

public class Solution {
    public static List<Pair<Character, Integer>> orderedCount(String text) {
        Map<Character, Integer> map = new LinkedHashMap<>();

        for (char character : text.toCharArray()) {
            map.put(character, map.getOrDefault(character, 0) + 1);
        }

        List<Pair<Character, Integer>> pairs = new ArrayList<>();

        for (Map.Entry<Character, Integer> entry : map.entrySet()) {
            pairs.add(Pair.of(entry.getKey(), entry.getValue()));
        }

        return pairs;
    }
}
