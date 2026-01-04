package task029;

import java.util.LinkedHashSet;
import java.util.Set;

//https://www.codewars.com/kata/5ba38ba180824a86850000f7/train/java
public class Solution {
    public static int [] solve(int [] arr){
        Set<Integer> set = new LinkedHashSet<>();
        for (int i = arr.length - 1; i >= 0 ; i--) {
            set.add(arr[i]);
        }

        int[] uniqueArray = new int[set.size()];
        int i = set.size() - 1;
        for (int val : set) {
            uniqueArray[i--] = val;
        }

        return uniqueArray;
    }
}
