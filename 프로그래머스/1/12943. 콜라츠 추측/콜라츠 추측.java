class Solution {
    private static final int MAX_REPEAT = 500;

    public int solution(int paramNumber) {
        if (paramNumber > 8_000_000) {
            throw new IllegalArgumentException("입력된 수, number은 1 이상 8,000,000 미만인 정수입니다.");
        }
        if (paramNumber == 1) {
            return 0;
        }

        long number = paramNumber;
        int count = 0;
        while (number != 1) {
            if (count >= MAX_REPEAT) {
                return -1;
            }
            number = (number % 2 == 0) ? number / 2 : (number * 3) + 1;
            count++;
        }

        return count;
    }
}
