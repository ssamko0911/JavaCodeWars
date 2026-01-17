package task108;

//https://www.codewars.com/kata/61123a6f2446320021db987d/train/java

public class Kata {
    public static final int BASE = 3;
    public static final int REDUCER = 10;

    public static Integer prevMultipleOfThree(int number){
        while(number != 0){
            if (number % Kata.BASE == 0) {
                return number;
            }

            number = number / Kata.REDUCER;

            if (number == 0) {
                return null;
            }
        }

        return null;
    }
}
