package task057;

//https://www.codewars.com/kata/5aee86c5783bb432cd000018/train/java

import java.util.ArrayList;
import java.util.List;

public class Drinkin {
    public final String WATER_CALC_STR = "%d %s of water";
    public final String GLASS_SINGULAR = "glass";
    public final String GLASS_PLURAL = "glasses";

    public String hydrate(String drinkString) {
        String[] words = drinkString.split(" ");
        int totalWater = this.getSum(this.parseNumbers(words));

        return String.format(
                this.WATER_CALC_STR,
                totalWater,
                totalWater > 1 ? this.GLASS_PLURAL : this.GLASS_SINGULAR
        );
    }

    private List<Integer> parseNumbers(String[] strings) {
        List<Integer> numbers = new ArrayList<>();

        for (String item : strings) {
            if (item != null && item.matches("\\d+")) {
                numbers.add(Integer.parseInt(item));
            }
        }

        return numbers;
    }

    private int getSum(List<Integer> numbers) {
        int sum = 0;

        for (int number : numbers) {
            sum += number;
        }

        return sum;
    }
}
