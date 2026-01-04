package src.task082;

//https://www.codewars.com/kata/5d49c93d089c6e000ff8428c/train/java

public class Kata {
    public static int save(int[] sizes, int hd) {
        int fileCounter = 0;
        int sizeSum = 0;

        for (int fileSize : sizes) {
            sizeSum += fileSize;

            if (sizeSum <= hd) {
                fileCounter++;
            } else {
                return fileCounter;
            }
        }

        return fileCounter;
    }
}
