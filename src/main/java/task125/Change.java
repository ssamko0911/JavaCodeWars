package task125;

// https://www.codewars.com/kata/5571f712ddf00b54420000ee/train/java

import java.util.HashMap;

public class Change {
    public static final String[] COIN_TYPES = {"Quarters", "Dimes", "Nickels", "Pennies"};
    public static final int[] COIN_VALUES = {25, 10, 5, 1};

    public static HashMap<String, Integer> looseChange(int cent) {
        HashMap<String, Integer> map = new HashMap<>();
        map.put("Pennies", 0);
        map.put("Nickels", 0);
        map.put("Dimes", 0);
        map.put("Quarters", 0);

        int totalCents = cent;
        int coinIndex = 0;

        while (totalCents > 0) {
            int quantity = totalCents / COIN_VALUES[coinIndex];
            map.put(COIN_TYPES[coinIndex], map.get(COIN_TYPES[coinIndex]) + quantity);
            totalCents -= quantity * COIN_VALUES[coinIndex];
            coinIndex++;
        }

        return map;
    }
}
