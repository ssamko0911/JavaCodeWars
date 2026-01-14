package task102;

//https://www.codewars.com/kata/57873ab5e55533a2890000c7/train/java

import java.util.Arrays;
import java.util.List;

public class Solution {
    public static final int HOUR = 24;
    public static final int TIME_UNITS = 60;
    public static final String TIME_REGEX = "\\d{2}:\\d{2}:\\d{2}";
    public static final String PATTERN = "%02d:%02d:%02d";

    public static String timeCorrect(String timestring) {
        if (timestring == null) {
            return null;
        }

        if (timestring.isEmpty()) {
            return "";
        }

        if (!timestring.matches(Solution.TIME_REGEX)) {
            return null;
        }

        List<Integer> timeAsList = Arrays.stream(timestring.split(":"))
                .map(Integer::parseInt)
                .toList();

        int secondsCalculated = timeAsList.get(2) % Solution.TIME_UNITS;
        int minuteUpdated = timeAsList.get(1) + (timeAsList.get(2) / Solution.TIME_UNITS);
        int minutesCalculated = minuteUpdated % Solution.TIME_UNITS;
        int hoursUpdated = timeAsList.get(0) + (minuteUpdated / Solution.TIME_UNITS);
        int hoursCalculated = hoursUpdated % Solution.HOUR;

        return String.format(Solution.PATTERN, hoursCalculated, minutesCalculated, secondsCalculated);
    }
}
