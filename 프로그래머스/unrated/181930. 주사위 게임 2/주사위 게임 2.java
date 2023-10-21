class Solution {
    public static int solution(int a, int b, int c) {
        int answer = 0;
        int plus = a + b + c;
        int square = (int) (Math.pow(a, 2) + Math.pow(b, 2) + Math.pow(c, 2));
        int cube = (int) (Math.pow(a, 3) + Math.pow(b, 3) + Math.pow(c, 3));

        if (a == b && b == c) {
            answer = plus * square * cube;
        }
        if ((a == b && b != c) || (b == c && a != b) || (a == c && a != b)) {
            answer = plus * square;
        }
        if (a != b && b != c && c != a) {
            answer = plus;
        }

        return answer;
    }
}
