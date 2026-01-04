package task073;

public class Kata {
    public static String duckDuckGoose(String[] players, int goose) {
        int idx = (goose - 1) % players.length;

        return players[idx];
    }
}
