package task004;

import java.util.*;

//https://www.codewars.com/kata/55b42574ff091733d900002f/train/java
public class Kata {
    public static List<String> getFriends(List<String> people){
        List<String> friends = new ArrayList<>();
        final int NAME_LENGTH = 4;

        for (String person : people) {
            if (NAME_LENGTH == person.length()) {
                friends.add(person);
            }
        }

        return friends;
    }
}
