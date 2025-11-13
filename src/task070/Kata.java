package src.task070;

//https://www.codewars.com/kata/57faa6ff9610ce181b000028/train/java

public class Kata {
    public static String crap(
            char[][] garden,
            int bags,
            int cap
    ) {
        int totalCapacity = bags * cap;
        int counter = 0;

        for (char[] chars : garden) {
            for (char aChar : chars) {
                if (aChar == 'D') {
                    return "Dog!!";
                }

                if (aChar == '@') {
                    counter++;
                }
            }
        }

        return totalCapacity >= counter ? "Clean" : "Cr@p";
    }
}
