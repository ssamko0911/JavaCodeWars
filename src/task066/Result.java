package src.task066;

import java.util.*;

/**
 * <h1>Count Elements Greater Than Previous Average</h1>
 * <p>
 * Given an array of positive integers, return the number of elements that are strictly greater than
 * the average of all previous elements. Skip the first element.
 * </p>
 * <p><strong>Example:</strong></p>
 * <p>Input</p>
 * <pre>
 *     {@code
 *     int[] responseTimes = [100, 200, 150,300]
 *     }
 * </pre>
 * <p>Output</p>
 * <pre>
 *     {@code
 *     2
 *     }
 * </pre>
 * <p>Explanation</p>
 * <pre>
 *     {@code
 *     - Day 0: 100 (no previous days, skip)
 *     - Day 1: 200 > average(100) = 100 → count = 1
 *     - Day 2: 150 vs average(100, 200) = 150 → not greater → count = 1
 *     - Day 3: 300 > average(100, 200, 150) = 150 → count = 2 Return 2.
 *     }
 * </pre>
 * <p>Input format</p>
 * <pre>
 *     {@code
 *     The first line contains an integer n (0 ≤ n ≤ 1000), the number of days.
 *     If n > 0, the next n lines contains an integer representing responseTimes[i].
 *     If n = 0, the second line is omitted or empty.
 *     }
 * </pre>
 * <p>here 4 is the length of array, followed by the elements of array on each line.</p>
 * <p>Constraints</p>
 * <pre>
 *     {@code
 *     0 <= responseTimes.length <= 1000
 *     1 <= responseTimes[i] <= 10^9 for 0 <= i < responseTimes.length
 *     }
 * </pre>
 * <p>Output Format</p>
 * <pre>
 *     {@code
 *     A single integer depicting the count of days.
 *     }
 * </pre>
 */
public class Result {
    public static int countResponseTimeRegressions(List<Integer> responseTimes) {
        if (responseTimes.size() <= 1) {
            return 0;
        }

        int dayCount = 0;

        for (int i = 1; i < responseTimes.size(); i++) {
            double responseTimesByDayCountAvg = Result.getAverageResponseTime(responseTimes.subList(0, i));

            if (responseTimesByDayCountAvg < responseTimes.get(i)) {
                dayCount++;
            }
        }

        return dayCount;
    }

    private static double getAverageResponseTime(List<Integer> responseTimes) {
        long totalResponseTime = 0;

        for (Integer responseTime : responseTimes) {
            totalResponseTime += responseTime;
        }

        return (double) totalResponseTime / responseTimes.size();
    }
}
