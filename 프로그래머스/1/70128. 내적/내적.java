import java.util.stream.IntStream;

class Solution {
    public int solution(int[] arrayA, int[] arrayB) {
        if (arrayA.length != arrayB.length) {
            throw new IllegalArgumentException("두 배열의 길이가 같지 않습니다.");
        }
        
        return IntStream.range(0, arrayA.length)
                .map(i -> arrayA[i] * arrayB[i])
                .sum();
    }
}
