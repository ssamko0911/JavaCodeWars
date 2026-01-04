package task028;

//https://www.codewars.com/kata/5375f921003bf62192000746/train/java
public class Abbreviator {
    private static final int SHORT_WORD = 4;
    private static final int WORD_LENGTH_DELTA = 2;

    public String abbreviate(String string) {
        System.out.println(string);
        StringBuilder abbreviated = new StringBuilder();

        char[] letters = string.toCharArray();
        StringBuilder tempWord = new StringBuilder();

        for (char letter : letters) {
            if (Character.isLetter(letter)) {
                tempWord.append(letter);
            } else {
                String abbr = this.abbreviateWord(tempWord.toString());
                abbreviated.append(abbr);
                abbreviated.append(letter);
                tempWord.setLength(0);
            }
        }

        if (!tempWord.isEmpty()) {
            abbreviated.append(abbreviateWord(tempWord.toString()));
        }

        return abbreviated.toString();
    }

    private String abbreviateWord(String word) {
        if (word.length() < Abbreviator.SHORT_WORD) {
            return word;
        }

        char[] tempLetters = word.toCharArray();
        String firstLetter = String.valueOf(tempLetters[0]);
        int letterCount = word.length() - Abbreviator.WORD_LENGTH_DELTA;
        String lastLetter = String.valueOf(tempLetters[tempLetters.length - 1]);

        return firstLetter + letterCount + lastLetter;
    }
}
