package task100;

//https://www.codewars.com/kata/56598d8076ee7a0759000087/train/java

import java.util.Locale;
import java.util.Map;

public class TipCalculator {
    public static final Map<String, Double> TIPS = Map.of(
            "terrible", 0.0,
            "poor", 0.05,
            "good", 0.1,
            "great", 0.15,
            "excellent", 0.2
    );

    public static Integer calculateTip(double amount, String rating) {
        for (Map.Entry<String, Double> entry : TIPS.entrySet()) {
            if (entry.getKey().equals(rating.toLowerCase(Locale.ROOT))) {
                return (int) Math.ceil(entry.getValue() * amount);
            }
        }

        return null;
    }
}
