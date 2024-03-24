import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;

class Solution {
    public long solution(long number) {
        List<Character> integers = new ArrayList<>();

        while (number > 0) {
            integers.add((char) ('0' + number % 10));
            number /= 10;
        }

        integers.sort(Comparator.reverseOrder());

        StringBuilder sortedStr = new StringBuilder();
        for (Character integer : integers) {
            sortedStr.append(integer);
        }

        return Long.parseLong(sortedStr.toString());
    }
}