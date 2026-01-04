package task001;

public class Game {
    //https://www.codewars.com/kata/586c1cf4b98de0399300001d/train/java
    public static int combat(int health, int damage) {
        return Math.max(health - damage, 0);
    }
}
