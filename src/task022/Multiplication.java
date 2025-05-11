package task022;

//https://www.codewars.com/kata/534d2f5b5371ecf8d2000a08/train/java
public class Multiplication {
    public static int[][] multiplicationTable(int n) {
        int[][] multiTable = new int[n][n];

        for (int i = 0; i < multiTable.length; i++) {
            for (int j = 0; j < multiTable[i].length; j++) {
                multiTable[i][j] = (i + 1) * (j + 1);
            }
        }

        return multiTable;
    }
}
