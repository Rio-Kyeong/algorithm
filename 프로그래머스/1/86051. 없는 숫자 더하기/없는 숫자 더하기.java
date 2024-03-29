import java.util.HashSet;
import java.util.Set;

class Solution {
    private static final int[] DIGITS = {1, 2, 3, 4, 5, 6, 7, 8, 9};

    public int solution(int[] numbers) {
        Set<Integer> set = new HashSet<>();
        for (int num : numbers) {
            set.add(num);
        }

        int result = 0;

        for (int digit : DIGITS) {
            if (!set.contains(digit)) {
                result += digit;
            }
        }

        return result;
    }
}
