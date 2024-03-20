class Solution {
    public long solution(int paramStartNumber, int paramEndNumber) {
        if (paramStartNumber == paramEndNumber) {
            return paramEndNumber;
        }

        int startNumber = Math.min(paramStartNumber, paramEndNumber);
        int endNumber = Math.max(paramStartNumber, paramEndNumber);

        long sum = 0;
        for (int i = startNumber; i <= endNumber; i++) {
            sum += i;
        }

        return sum;
    }
}