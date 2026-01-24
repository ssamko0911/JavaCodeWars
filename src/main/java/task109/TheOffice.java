package task109;

//https://www.codewars.com/kata/57ed4cef7b45ef8774000014/train/java

import java.util.Map;

public class TheOffice {
    public static final Map<String, Integer> SCORES = Map.of(
            "accounts", 1,
            "finance", 2,
            "canteen", 10,
            "regulation", 3,
            "trading", 6,
            "change", 6,
            "IS", 8,
            "retail", 5,
            "cleaning", 4,
            "pissing about", 25
    );

    public static final String LOW_SCORE_LABEL = "kill me now";
    public static final String AVERAGE_SCORE_LABEL = "i can handle this";
    public static final String HIGH_SCORE_LABEL = "party time!!";

    public static final int SCORE_THRESHOLD_LOW = 80;
    public static final int SCORE_THRESHOLD_HIGH = 100;

    public static String boredom(Person[] staff) {
        int totalScore = 0;

        for (Person person : staff) {
            if (TheOffice.SCORES.containsKey(person.department)) {
                totalScore += TheOffice.SCORES.get(person.department);
            }
        }

        return TheOffice.getScoreLabel(totalScore);
    }

    private static String getScoreLabel(int score) {
        if (score <= TheOffice.SCORE_THRESHOLD_LOW) {
            return TheOffice.LOW_SCORE_LABEL;
        }

        if (score < TheOffice.SCORE_THRESHOLD_HIGH) {
            return TheOffice.AVERAGE_SCORE_LABEL;
        }

        return TheOffice.HIGH_SCORE_LABEL;
    }
}

