package src.task079;

//https://www.codewars.com/kata/52aeb2f3ad0e952f560005d3/train/java

import java.util.Arrays;
import java.util.Set;
import java.util.TreeSet;

public class GiftSorter{
    public String sortGiftCode(String code){
        Set<String> giftCodes = new TreeSet<String>(
                Arrays.asList(code.split(""))
        );

        StringBuilder s = new StringBuilder();
        for (String giftCode : giftCodes) {
            s.append(giftCode);
        }

        return s.toString();
    }
}
