package task005;

//Printing Array elements with Comma delimiters
public class ArrayPrinter {
    public static String printArray(Object[] array) {
        final char DELIMETER = ',';
        String concatenated = "";

        for (int i = 0; i < array.length; i++) {
            if (array.length - 1 == i) {
                concatenated += String.valueOf(array[i]);
            } else {
                concatenated += String.valueOf(array[i]);
                concatenated += DELIMETER;

            }
        }

        return concatenated;
    }
}
