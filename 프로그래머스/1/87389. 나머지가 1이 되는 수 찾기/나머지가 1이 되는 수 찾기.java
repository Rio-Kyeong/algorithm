import java.util.stream.IntStream;

class Solution {
    public static int solution(int n) {
        return IntStream.range(2, n)
                .filter((i) -> n % i == 1)
                .findFirst()
                .orElse(0);
    }
}
