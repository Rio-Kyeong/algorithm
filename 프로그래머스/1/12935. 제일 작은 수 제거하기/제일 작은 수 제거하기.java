import java.util.Arrays;

class Solution {
    public int[] solution(int[] array) {
        if (array.length <= 1) {
            return new int[] {-1};
        }

        int min = Arrays.stream(array).min().getAsInt();
        return Arrays.stream(array)
                .filter(num -> num != min)
                .toArray();
    }
}
