class Solution {
    public int solution(String dartResult) {
        int[] scores = new int[dartResult.length()];
        int index = 0;
        int answer = 0;

        for (int i = 0; i < dartResult.length(); i++) {
            char character = dartResult.charAt(i);
            if (Character.isDigit(character)) {
                if (i > 0 && Character.isDigit(dartResult.charAt(i - 1))) {
                    scores[index - 1] = 10;
                } else {
                    scores[index++] = character - '0';
                }
            } else {
                switch (character) {
                    case 'S':
                        break;
                    case 'D':
                        scores[index - 1] = (int) Math.pow(scores[index - 1], 2);
                        break;
                    case 'T':
                        scores[index - 1] = (int) Math.pow(scores[index - 1], 3);
                        break;
                    case '*':
                        scores[index - 1] *= 2;
                        if (index > 1) { scores[index - 2] *= 2; }
                        break;
                    case '#':
                        scores[index - 1] *= -1;
                        break;
                }
            }
        }

        for (int score : scores) {
            answer += score;
        }

        return answer;
    }
}
