package task010;

//https://www.codewars.com/kata/5a2fd38b55519ed98f0000ce/train/java
public class Kata {
    public static String multiTable(int num) {
        StringBuilder table = new StringBuilder();
        int tableLines = 10;

        for (int i = 1; i <= tableLines; i++) {
            table.append(Kata.generateTableLine(i, num));

            if (tableLines != i) {
                table.append("\n");
            }
        }

        return table.toString();
    }

    private static String generateTableLine(int operandOne, int operandTwo) {
        return String.format("%d * %d = %d", operandOne, operandTwo, operandOne * operandTwo);
    }
}
