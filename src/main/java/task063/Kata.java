package task063;

// https://www.codewars.com/kata/5fc7d2d2682ff3000e1a3fbc/train/java

public class Kata {

    public static boolean isAValidMessage(String message) {
        if (message.isEmpty() || !Character.isDigit(message.charAt(0)) || Character.isDigit(message.charAt(message.length()-1))) {
            return false;
        }

        char[] chars = message.toCharArray();

        StringBuilder tempInt = new StringBuilder();
        StringBuilder tempStr = new StringBuilder();

        for (char aChar : chars) {

            if (Integer.parseInt(String.valueOf(aChar)) > 0) {
                tempInt.append(aChar);
            } else {
                tempStr.append(aChar);
            }

            if (Integer.parseInt(tempInt.toString()) != tempStr.length()) {
                return false;
            }

            tempStr.setLength(0);
            tempInt.setLength(0);
        }

        return true;
    }
}
