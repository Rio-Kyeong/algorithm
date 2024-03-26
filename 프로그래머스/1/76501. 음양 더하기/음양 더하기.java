class Solution {
    public int solution(int[] absolutes, boolean[] signs) {
        if (absolutes == null || signs == null) {
            throw new IllegalArgumentException("absolutes 배열 또는 signs 배열이 null입니다.");
        }
        if (absolutes.length < 1 || absolutes.length > 1000) {
            throw new IllegalArgumentException("absolutes의 길이는 1 이상 1,000 이하입니다.");
        }
        if (signs.length != absolutes.length) {
            throw new IllegalArgumentException("signs의 길이는 absolutes의 길이와 같아야 합니다.");
        }

        int answer = 0;
        for (int i = 0; i < absolutes.length; i++) {
            int number = absolutes[i];
            if (!signs[i]) {
                number = -(number);
            }
            answer += number;
        }

        return answer;
    }
}
