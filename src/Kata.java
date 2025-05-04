import java.util.Objects;

//https://www.codewars.com/kata/5672a98bdbdd995fad00000f/train/java
public class Kata {
    private static final String ROCK = "rock";
    private static final String PAPER = "paper";
    private static final String SCISSORS = "scissors";
    private static final String P_ONE_WINNER = "Player 1 won!";
    private static final String P_TWO_WINNER = "Player 2 won!";
    private static final String DRAW = "Draw!";

    public static String rps(String p1, String p2) {
        if (p1.equals(p2)) {
            return Kata.DRAW;
        }

        return Kata.getWinner(p1, p2);
    }

    private static String getWinner(String p1, String p2) {
        if ((p1 + p2).equals(Kata.SCISSORS + Kata.PAPER) ||
                (p1 + p2).equals(Kata.ROCK + Kata.SCISSORS) ||
                (p1 + p2).equals(Kata.PAPER + Kata.ROCK)
        ) {
            return Kata.P_ONE_WINNER;
        } else {
            return Kata.P_TWO_WINNER;
        }
    }
}
