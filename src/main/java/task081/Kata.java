package task081;

//https://www.codewars.com/kata/59f061773e532d0c87000d16/train/java

public class Kata {
    public static int elevatorDistance(int[] arr){
        if (0 == arr.length) {
            return 0;
        }

        int totalFloors = 0;

        for(int i = 1; i < arr.length; i++){
            totalFloors += Math.abs(arr[i] - arr[i-1]);
        }

        return totalFloors;
    }
}
