package task101;

import java.util.*;

//https://www.codewars.com/kata/695688e9858d531c29a9d748/train/java

public class BruteForceDetector {
    public static final String FILTER = "LOGIN_FAIL";
    public static final int CONSECUTIVE_FAILURES = 3;

    public static List<String> detectBruteForce(String[] logs) {
        Map<String, Integer> failures = new HashMap<>();
        Set<String> ips = new HashSet<>();

        for (String log : logs) {
            String ip = log.substring(0, log.indexOf(" "));

            if (log.contains(BruteForceDetector.FILTER)) {
                failures.put(ip, failures.getOrDefault(ip, 0) + 1);

                if (failures.get(ip) >= BruteForceDetector.CONSECUTIVE_FAILURES) {
                    ips.add(ip);
                }
            } else {
                failures.put(ip, 0);
            }
        }

        return ips.stream()
                .sorted()
                .toList();
    }
}
