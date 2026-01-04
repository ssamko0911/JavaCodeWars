package src.task074;

//https://www.codewars.com/kata/53d16bd82578b1fb5b00128c/train/java

import java.util.HashMap;
import java.util.Map;

public class Grader {
    final static private Map<String, Character> GRADES = new HashMap<>() {
        {
            put("gradeA", 'A');
            put("gradeB", 'B');
            put("gradeC", 'C');
            put("gradeD", 'D');
            put("gradeF", 'F');
        }
    };

    final static private Map<String, Double> THRESHOLDS = new HashMap<>() {
        {
            put("gradeA", 0.9);
            put("gradeB", 0.8);
            put("gradeC", 0.7);
            put("gradeD", 0.6);
            put("gradeF", 1.0);
        }
    };

    public static char grader(double score) {
        if (score < Grader.THRESHOLDS.get("gradeD") || score > Grader.THRESHOLDS.get("gradeF")) {
            return Grader.GRADES.get("gradeF");
        } else if (score == Grader.THRESHOLDS.get("gradeD") || score < Grader.THRESHOLDS.get("gradeC")) {
            return Grader.GRADES.get("gradeD");
        } else if (score == Grader.THRESHOLDS.get("gradeC") || score < Grader.THRESHOLDS.get("gradeB")) {
            return Grader.GRADES.get("gradeC");
        } else if (score == Grader.THRESHOLDS.get("gradeB") || score < Grader.THRESHOLDS.get("gradeA")) {
            return Grader.GRADES.get("gradeB");
        } else {
            return Grader.GRADES.get("gradeA");
        }
    }
}
