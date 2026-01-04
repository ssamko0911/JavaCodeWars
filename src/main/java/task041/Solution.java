package task041;

//https://www.codewars.com/kata/580a4734d6df748060000045/train/java
public class Solution {
    public static String DESCENDING = "yes, descending";
    public static String ASCENDING = "yes, ascending";
    public static String OTHERWISE = "no";

    public static String isSortedAndHow(int[] array) {
        boolean isDescending = false;
        boolean isAscending = false;

        for (int i = 1; i < array.length; i++) {
            if (array[i] < array[i - 1]) {
                isDescending = true;
            }

            if (array[i] > array[i - 1]) {
                isAscending = true;
            }
        }

        if (isAscending && isDescending) {
            return Solution.OTHERWISE;
        }

        if (isDescending) {
            return Solution.DESCENDING;
        } else {
            return Solution.ASCENDING;
        }
    }
}
