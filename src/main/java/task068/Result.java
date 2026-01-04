package task068;

import java.util.List;

/**
 * <h1>Find the Smallest Missing Positive Integer</h1>
 * <p>
 * Given an unsorted array of integers, find the smallest positive integer not present in the array
 * in O(n) time and O(1) extra space.
 * </p>
 * <p><strong>Example:</strong></p>
 * <p>Input</p>
 * <pre>
 *     {@code
 *     orderNumbers = [3, 4, -1, 1]
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
 * We want the smallest positive missing integer.
 * Start with [3, 4, -1, 1]
 *  - i=0: value 3 ⇒ swap with index 2 ⇒ [-1, 4, 3, 1]
 *  - i=0: value -1 is out of range ⇒ move on
 *  - i=1: value 4 ⇒ swap with index 3 ⇒ [-1, 1, 3, 4]
 *  - i=1: value 1 ⇒ swap with index 0 ⇒ [1, -1, 3, 4]
 *  - now 1 at index 0, 3 at 2, 4 at 3; -1 remains at index 1
 *
 * Scan from index 0:
 * index 0 has 1 (correct), index 1 has -1 (not 2) ⇒ missing positive is 2
 *     }
 * </pre>
 * <p>Input format</p>
 * <pre>
 *     {@code
 *     An integer n on the first line, where 0 ≤ n ≤ 1000.
 *     The next n lines contains an integer representing orderNumbers[i].
 *     }
 * </pre>
 * <p>Example:</p>
 * <pre>
 *   {@code
 *      4
 *      3
 *      4
 *      -1
 *      1
 *  }
 * </pre>
 * <p>here 4 is the length of array, followed by the elements of array on each line.</p>
 * <p>Constraints</p>
 * <pre>
 *     {@code
 *     0 <= orderNumbers.length <= 1000
 *     -10^9 <= orderNumbers[i] <= 10^9 for all 0 <= i < orderNumbers.length
 *     Duplicates are allowed in orderNumbers
 *     Negative numbers and zero are allowed in orderNumbers
 *     }
 * </pre>
 * <p>Output Format</p>
 * <pre>
 *     {@code
 *     A single integer denoting the smallest positive order number (≥1) that does not appear in the input array.
 *     }
 * </pre>
 */
public class Result {
    /*
     * Complete the 'findSmallestMissingPositive' function below.
     *
     * The function is expected to return an INTEGER.
     * The function accepts INTEGER_ARRAY orderNumbers as parameter.
     */

    public static int findSmallestMissingPositive(List<Integer> orderNumbers) {
        return 1;
    }
}
