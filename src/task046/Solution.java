package task046;

import java.util.Arrays;

//https://www.codewars.com/kata/5a9e86705ee396d6be000091/train/java
public class Solution {
    private static final char[] CHARS_INCLUDED = {'a', 'b', 'c'};

    public boolean checkThreeAndTwo(char[] chars) {
        int[] allowedSizes = new int[Solution.CHARS_INCLUDED.length];
        int index = 0;

        for (int i = 0; i < Solution.CHARS_INCLUDED.length; i++) {
            for (char character : chars) {
                if (Solution.CHARS_INCLUDED[i] == character) {
                    allowedSizes[index]++;
                }
            }
            index++;
        }

        return isValidCharArray(allowedSizes);
    }

    private boolean isValidCharArray(int[] charCounts) {
        int notAllowedValueOne = 1;
        int notAllowedValueFour = 4;
        int notAllowedValueFife = 5;

        for (int size : charCounts) {
            if (notAllowedValueOne == size || notAllowedValueFour == size || notAllowedValueFife == size) {
                return false;
            }
        }

        return true;
    }
}
