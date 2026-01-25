package task117;

import java.util.ArrayList;
import java.util.List;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Dinglemouse {
    public static final String FAKE_TWEET_LABEL = "Fake tweet.";
    public static final String FIRE = "FIRE";
    public static final String FURY = "FURY";
    public static final String OPENING_FIRE = "You";
    public static final String OPENING_FURY = "I am";
    public static final String SUBSEQUENT_FIRE = " and you";
    public static final String SUBSEQUENT_FURY = " really";
    public static final String CLOSING_FIRE = " are fired! ";
    public static final String CLOSING_FURY = " furious. ";

    public static String fireAndFury(final String tweet) {
        if (!FireAndFuryValidator.containsOnlyAllowedChars(tweet)) {
            return Dinglemouse.FAKE_TWEET_LABEL;
        }

        StringBuilder decipher = new StringBuilder();
        StringBuilder tempFire = new StringBuilder();
        StringBuilder tempFury = new StringBuilder();

        int fireCount = 0;
        int furyCount = 0;

        List<String> tweets = new ArrayList<>();

        Pattern pattern = Pattern.compile(String.format("%s|%s", Dinglemouse.FIRE, Dinglemouse.FURY));
        Matcher matcher = pattern.matcher(tweet);

        while (matcher.find()) {
            tweets.add(matcher.group());
        }

        if (tweets.isEmpty()) {
            return Dinglemouse.FAKE_TWEET_LABEL;
        }

        for (String tw : tweets) {
            switch (tw) {
                case Dinglemouse.FIRE:
                    if (furyCount > 0) {
                        furyCount = 0;
                        Dinglemouse.flush(tempFury, decipher, Dinglemouse.CLOSING_FURY);
                    }

                    fireCount = Dinglemouse.appendFirstOrSubsequent(tempFire, fireCount, Dinglemouse.OPENING_FIRE, Dinglemouse.SUBSEQUENT_FIRE);
                    break;
                case Dinglemouse.FURY:
                    if (fireCount > 0) {
                        fireCount = 0;
                        Dinglemouse.flush(tempFire, decipher, Dinglemouse.CLOSING_FIRE);
                    }

                    furyCount = Dinglemouse.appendFirstOrSubsequent(tempFury, furyCount, Dinglemouse.OPENING_FURY, Dinglemouse.SUBSEQUENT_FURY);
                    break;
                default:
                    throw new IllegalArgumentException(Dinglemouse.FAKE_TWEET_LABEL);
            }

        }

        if (fireCount != 0) {
            Dinglemouse.flush(tempFire, decipher, Dinglemouse.CLOSING_FIRE);
        }

        if (furyCount != 0) {
            Dinglemouse.flush(tempFury, decipher, Dinglemouse.CLOSING_FURY);
        }

        return decipher.toString().trim();
    }

    private static void flush(StringBuilder tempStringBuilder, StringBuilder target, String closingStr) {
        target.append(tempStringBuilder).append(closingStr);
        tempStringBuilder.setLength(0);
    }

    private static int appendFirstOrSubsequent(StringBuilder tempStringBuilder, int counter, String first, String subsequent) {
        tempStringBuilder.append(counter == 0 ? first : subsequent);

        return counter + 1;
    }
}
