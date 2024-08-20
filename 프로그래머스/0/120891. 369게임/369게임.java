import java.util.stream.IntStream;

class Solution {
    public int solution(int order) {
        return (int) String.valueOf(order).chars()
                .filter(ch -> ch == '3' || ch == '6' || ch == '9')
                .count();
    }
}
