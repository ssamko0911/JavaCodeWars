package task096;

//https://www.codewars.com/kata/656e4602ee72af0017e37e82/train/java

// Refactor logic;

public class CuckooClock {
    public final static int QUARTER_HOUR_MIN = 15;;
    public final static int THREE_QUARTERS_MIN = 45;
    public final static int HOUR_MIN = 60;
    public final static int HOURS_EDGE_CASE = 12;
    public final static int[] MINUTE_PER_CHIME = {0, 15, 30, 45};
    public final static String TIME_OUTPUT = "%02d:%02d";

    public static String cuckooClock(String inputTime, int chimes) {
        String[] inputTimeAsArray = inputTime.split(":");
        int hours = Integer.parseInt(inputTimeAsArray[0]);
        int min = Integer.parseInt(inputTimeAsArray[1]);

        if (min > CuckooClock.THREE_QUARTERS_MIN) {
            hours++;
        }

        min = CuckooClock.getNextChimeMinute(min);

        if (min == 0) {
            chimes -= hours;

            if (chimes <= 0) {
                return String.format(CuckooClock.TIME_OUTPUT, hours, min);
            }

            min += CuckooClock.QUARTER_HOUR_MIN;
        }

        while (chimes > 0) {
            if (min == CuckooClock.HOUR_MIN) {
                min = 0;
            }

            if (min == 0) {
                hours = CuckooClock.addHours(hours);
                chimes -= hours;
            }  else {
                chimes--;
            }

            if (chimes <= 0) {
                break;
            }

            min += CuckooClock.QUARTER_HOUR_MIN;
        }

        return String.format(CuckooClock.TIME_OUTPUT, hours, min);
    }

    private static int getNextChimeMinute(int min) {
        for (int chime : MINUTE_PER_CHIME) {
            if (min <= chime) {
                return chime;
            }
        }

        return 0;
    }

    private static int addHours(int hours) {
        if (hours == CuckooClock.HOURS_EDGE_CASE) {
            return 1;
        }

        return hours + 1;
    }
}
