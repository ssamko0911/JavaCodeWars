package task104;

//https://www.codewars.com/kata/59dd3ccdded72fc78b000b25/java

public class DayOfWeek {
    public static final String DEFAULT = "Wrong, please enter a number between 1 and 7";

    public static String getDay(int number) {
        return switch (number) {
            case 1 -> Day.SUNDAY.getDay();
            case 2 -> Day.MONDAY.getDay();
            case 3 -> Day.TUESDAY.getDay();
            case 4 -> Day.WEDNESDAY.getDay();
            case 5 -> Day.THURSDAY.getDay();
            case 6 -> Day.FRIDAY.getDay();
            case 7 -> Day.SATURDAY.getDay();
            default -> DayOfWeek.DEFAULT;
        };
    }
}

enum Day {
    MONDAY("Monday"),
    TUESDAY("Tuesday"),
    WEDNESDAY("Wednesday"),
    THURSDAY("Thursday"),
    FRIDAY("Friday"),
    SATURDAY("Saturday"),
    SUNDAY("Sunday");

    private final String day;

    Day(String day) {
        this.day = day;
    }

    public String getDay() {
        return this.day;
    }
}
