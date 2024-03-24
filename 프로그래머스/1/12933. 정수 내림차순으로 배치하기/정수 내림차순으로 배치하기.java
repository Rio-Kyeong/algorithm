import java.util.Arrays;
import java.util.Comparator;

class Solution {
    public long solution(long number) {
        String[] strings = String.valueOf(number).split("");

        Arrays.sort(strings, Comparator.reverseOrder());

        StringBuilder resultBuilder = new StringBuilder();
        for (String string : strings) {
            resultBuilder.append(string);
        }

        return Long.parseLong(resultBuilder.toString());
    }
}
