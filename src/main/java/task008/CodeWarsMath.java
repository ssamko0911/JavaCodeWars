package task008;

//https://www.codewars.com/kata/5a805d8cafa10f8b930005ba/train/java
public class CodeWarsMath {
    public static int nearestSq(final int n){
        double squareRoot = Math.sqrt(n);

        if (squareRoot == Math.floor(squareRoot)) {
            return n;
        } else {
            return CodeWarsMath.getNearestSquare(squareRoot, n);
        }
    }

    private static int getNearestSquare(double square, int number) {
        double roundedUpSquare = Math.ceil(square);
        double roundedDownSquare = Math.floor(square);

        double valueRoundedUpSquare = roundedUpSquare * roundedUpSquare;
        double valueRoundedDownSquare = roundedDownSquare * roundedDownSquare;

        double diffRoundedUpSquare = Math.abs((int)(valueRoundedUpSquare - number));
        double diffRoundedDownSquare = Math.abs((int)(valueRoundedDownSquare - number));

        if (diffRoundedUpSquare < diffRoundedDownSquare) {
            return (int) (valueRoundedUpSquare);
        } else {
            return (int) (valueRoundedDownSquare);
        }
    }
}
