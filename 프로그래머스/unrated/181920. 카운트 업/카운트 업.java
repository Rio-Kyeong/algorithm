import java.util.stream.IntStream;

class Solution {
    public static int[] solution(int start_num, int end_num) {
        return IntStream.rangeClosed(start_num, end_num).toArray();
    }
}
