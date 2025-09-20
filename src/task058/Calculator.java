package task058;

//https://www.codewars.com/kata/5296455e4fe0cdf2e000059f/train/java

public class Calculator {
    private static final String ADD = "+";
    private static final String SUBTRACT = "-";
    private static final String MULTIPLY = "*";
    private static final String DIVIDE = "/";

    public static Double calculate(final double numberOne, final String operation, final double numberTwo)
    {
        return switch (operation) {
            case ADD -> add(numberOne, numberTwo);
            case SUBTRACT -> subtract(numberOne, numberTwo);
            case MULTIPLY -> multiply(numberOne, numberTwo);
            case DIVIDE -> divide(numberOne, numberTwo);
            default -> null;
        };
    }

    private static Double add(double numberOne, double numberTwo) {
        return numberOne + numberTwo;
    }

    private static Double subtract(double numberOne, double numberTwo) {
        return numberOne - numberTwo;
    }

    private static Double multiply(double numberOne, double numberTwo) {
        double result = numberOne * numberTwo;

        if (0.0 == result) {
            result = 0.0;
        }

        return result;
    }

    private static Double divide(double numberOne, double numberTwo) {
        if (0 == numberTwo) {
            return null;
        }

        return numberOne / numberTwo;
    }
}
