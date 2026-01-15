package task059;

//https://www.codewars.com/kata/57e8fba2f11c647abc000944/train/java

public class CodeWars {
    final static private String MATCH = "Fire";

    public static String fireFight(String str) {
        return str.replace(CodeWars.MATCH, "~~");

    }
}
