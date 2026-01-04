package task056;

//https://www.codewars.com/kata/5939ab6eed348a945f0007b2/train/java

public class Kata {
    public static String longestWord(String wordString) {
        String[] words = wordString.split(" ");

        String longestWord = words[0];

        for (String word: words) {
            if (word.length() >= longestWord.length()) {
                longestWord = word;
            }
        }

        return longestWord;
    }
}
