import java.util.Arrays;
import java.util.IntSummaryStatistics;

class Solution {
    public String solution(String s) {
        IntSummaryStatistics stats = Arrays.stream(s.split(" "))
                .mapToInt(Integer::parseInt)
                .summaryStatistics();

        return stats.getMin() + " " + stats.getMax();
    }
}
