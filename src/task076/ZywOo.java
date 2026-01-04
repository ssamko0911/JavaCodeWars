package src.task076;

//https://www.codewars.com/kata/5c8bfa44b9d1192e1ebd3d15/train/java

public class ZywOo {
    final private static String EATEN_TPL = "Oi! Sheep number %d! You are about to be eaten by a wolf!";
    final private static String GO_AWAY_TPL = "Pls go away and stop eating my sheep";
    final private static String WOLF = "wolf";

    public static String warnTheSheep(String[] array) {
        if (array[array.length - 1].equals(ZywOo.WOLF)) {
            return ZywOo.GO_AWAY_TPL;
        }

        for (int i = array.length - 2; i >= 0; i--) {
            if (array[i].equals(ZywOo.WOLF)) {
                return String.format(ZywOo.EATEN_TPL, array.length - i - 1);
            }
        }

        return "";
    }
}
