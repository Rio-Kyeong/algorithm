class Solution {
    public int solution(int left, int right) {
        int answer = 0;

        for (int i = left; i <= right; i++) {
            int sqrt = (int) Math.sqrt(i);

            if (sqrt * sqrt == i) { // 완전 제곱수의 경우 약수의 개수가 홀수
                answer -= i;
            } else {
                answer += i;
            }
        }

        return answer;
    }
}
