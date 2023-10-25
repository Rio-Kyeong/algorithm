import java.util.Arrays;
import java.util.stream.IntStream;

class Solution {
    public static int[] solution(int[] num_list) {
        int lastElement = num_list[num_list.length - 1];
        int beforeElement = num_list[num_list.length - 2];
        int resultElement = lastElement > beforeElement ? lastElement - beforeElement : lastElement * 2;

        return IntStream.concat(Arrays.stream(num_list), IntStream.of(resultElement)).toArray();
    }
}
