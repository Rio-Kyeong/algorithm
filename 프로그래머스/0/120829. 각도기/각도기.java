class Solution {
    public int solution(int angle) {
        int result = 0;

        if (0 < angle && angle < 90) {
            result = 1;
        }
        if (angle == 90) {
            result = 2;
        }
        if (90 < angle && angle < 180) {
            result = 3;
        }
        if (angle == 180) {
            result = 4;
        }

        return result;
    }
}
