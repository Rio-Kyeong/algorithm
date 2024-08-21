class Solution {
    public static final char ROCK = '0';      // 바위
    public static final char PAPER = '5';     // 보
    public static final char SCISSORS = '2';  // 가위

    public String solution(String rsp) {
        StringBuilder answer = new StringBuilder();

        for (char c : rsp.toCharArray()) {
            switch (c) {
                case SCISSORS:
                    answer.append(ROCK);
                    break;
                case PAPER:
                    answer.append(SCISSORS);
                    break;
                case ROCK:
                    answer.append(PAPER);
                    break;
                default:
                    break;
            }
        }

        return answer.toString();
    }
}
