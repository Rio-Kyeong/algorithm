import java.util.Arrays;

class Solution {
    public int solution(int[] sides) {
        if (sides.length != 3) {
            throw new IllegalArgumentException("배열의 길이는 3이어야 합니다.");
        }

        Arrays.sort(sides);
        
        return (sides[0] + sides[1] > sides[2]) ? 1 : 2;
    }
}
