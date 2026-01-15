package task103;

//https://www.codewars.com/kata/57f759bb664021a30300007d/java

public class Switch {
    public static final char A = 'a';
    public static final char B = 'b';

    public static String switcheroo(String str) {
        StringBuilder stringBuilder = new StringBuilder();
        char[] charArray = str.toCharArray();

        for (char character : charArray) {
            stringBuilder.append(switch (character) {
                case A -> Switch.B;
                case B -> Switch.A;
                default -> character;
            });
        }

        return stringBuilder.toString();
    }
}
