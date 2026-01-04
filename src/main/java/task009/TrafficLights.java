package task009;

//https://www.codewars.com/kata/58649884a1659ed6cb000072/train/java
public class TrafficLights {
    private static final String GREEN = "green";
    private static final String YELLOW = "yellow";
    private static final String RED = "red";

    public static String updateLight(String current) {
        return switch (current) {
            case TrafficLights.GREEN -> TrafficLights.YELLOW;
            case TrafficLights.YELLOW -> TrafficLights.RED;
            case TrafficLights.RED -> TrafficLights.GREEN;
            default -> "";
        };
    }
}
