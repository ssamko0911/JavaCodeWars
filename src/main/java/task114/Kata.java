package task114;

//https://www.codewars.com/kata/5631213916d70a0979000066/train/java

public class Kata {
    public static final String STAR_STR = "*";

    public static String pattern(int number){
        if (1 ==  number){
            return String.valueOf(number);
        }

        StringBuilder stringBuilder = new StringBuilder("1\n");

        for (int i = 2; i <= number; i++) {
            String stars = STAR_STR.repeat(i - 1);
            String newLine = i != number ? "\n" : "";
            stringBuilder.append(String.format("1%s%d%s", stars, i, newLine));
        }

        return stringBuilder.toString();
    }
}
