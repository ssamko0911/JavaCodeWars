package task099;

public class TimeConverter {
    public final static int TIME_UNIT = 60;
    public final static String TEMPLATE = "%d hour(s) and %d minute(s)";

    public static String toTime(int seconds) {
        int minutes = seconds / TimeConverter.TIME_UNIT;

        if (minutes < TimeConverter.TIME_UNIT) {
            return String.format(TimeConverter.TEMPLATE, 0, minutes);
        }

        int hours = minutes / TimeConverter.TIME_UNIT;

        return String.format(TimeConverter.TEMPLATE, hours, minutes % TimeConverter.TIME_UNIT);
    }
}
