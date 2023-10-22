import java.util.Arrays;

class Solution {
    public static int solution(int[] num_list) {
        int multiplication = Arrays.stream(num_list).reduce(1, (x, y) -> x * y);
        int addition = Arrays.stream(num_list).sum();

        return multiplication < Math.pow(addition, 2) ? 1 : 0;
    }
}
