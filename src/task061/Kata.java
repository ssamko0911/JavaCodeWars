package task061;

//https://www.codewars.com/kata/5809b62808ad92e31b000031/train/java

public class Kata {
    final static private String PLUS = "plus";
    final static private String MINUS = "minus";
    final static private String PATTERN = "(?=plus|minus)|(?<=plus|minus)";

    public static String calculate(String str) {
        String[] split = str.split(PATTERN);
        String operation = "";
        int result = Integer.parseInt(split[0]);

        for (int i = 1; i < split.length; i++) {
            if (i % 2 != 0) {
                operation = split[i];
            } else {
                switch (operation) {
                    case Kata.PLUS -> result += Integer.parseInt(split[i]);
                    case Kata.MINUS -> result -= Integer.parseInt(split[i]);
                }
            }
        }

        return String.valueOf(result);
    }
}
