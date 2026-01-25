package task117;

public class FireAndFuryValidator {
    public static final String ALLOWED_CHARS = "[EFIRUY]+";

    public static boolean containsOnlyAllowedChars(String tweet) {
        return tweet.matches("[EFIRUY]+");
    }
}
