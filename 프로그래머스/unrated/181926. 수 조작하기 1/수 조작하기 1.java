class Solution {
    public static int solution(final int n, final String control) {
        int answer = n;

        for (char character : control.toCharArray()) {
            if (character == 'w') {
                answer += 1;
            }
            if (character == 's') {
                answer -= 1;
            }
            if (character == 'd') {
                answer += 10;
            }
            if (character == 'a') {
                answer -= 10;
            }
        }

        return answer;
    }
}
