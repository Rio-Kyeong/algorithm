class Solution {
    public static int solution(int a, int d, boolean[] included) {
        int answer = 0;
        int arithmeticSequence = a;

        for (boolean include : included) {
            if (include) {
                answer += arithmeticSequence;
            }
            arithmeticSequence += d;
        }

        return answer;
    }
}
