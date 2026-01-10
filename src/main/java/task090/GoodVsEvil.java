package task090;

//https://www.codewars.com/kata/52761ee4cffbc69732000738/train/java

import java.util.stream.IntStream;

public class GoodVsEvil {
    public final static String GOOD_WIN = "Battle Result: Good triumphs over Evil";
    public final static String EVIL_WIN = "Battle Result: Evil eradicates all trace of Good";
    public final static String DRAW = "Battle Result: No victor on this battle field";

    public final static int[] GOOD_WORTH = {1, 2, 3, 3, 4, 10};
    public final static int[] EVIL_WORTH = {1, 2, 2, 2, 3, 5, 10};

    public static String battle(String goodAmounts, String evilAmounts) {
        int goodAmountsSum = getIntSum(goodAmounts, true);
        int evilAmountSum = getIntSum(evilAmounts, false);

        if (goodAmountsSum > evilAmountSum) {
            return GoodVsEvil.GOOD_WIN;
        } else if (goodAmountsSum < evilAmountSum) {
            return GoodVsEvil.EVIL_WIN;
        } else {
            return GoodVsEvil.DRAW;
        }
    }

    public static int getIntSum(String str, boolean isGood) {
        int[] multipliers = isGood ? GoodVsEvil.GOOD_WORTH : GoodVsEvil.EVIL_WORTH;

        return IntStream.range(0, multipliers.length)
                .map(i -> Integer.parseInt(str.split(" ")[i]) * multipliers[i])
                .sum();
    }
}
