import java.util.Arrays;
import java.util.stream.IntStream;
import java.util.stream.Stream;

class Solution {
    public static int[] solution(int n) {
        return IntStream.concat(
                        IntStream.iterate(n, i -> i != 1, i -> i % 2 == 0 ? i / 2 : 3 * i + 1),
                        IntStream.of(1)
        ).toArray();
    }
}
