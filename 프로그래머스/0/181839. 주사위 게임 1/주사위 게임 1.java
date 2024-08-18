class Solution {
    public int solution(int a, int b) {
        boolean isAOdd = a % 2 != 0;
        boolean isBOdd = b % 2 != 0;

        if (isAOdd && isBOdd) {
            return (int) (Math.pow(a, 2) + Math.pow(b, 2));
        } else if (isAOdd || isBOdd) {
            return 2 * (a + b);
        } else {
            return Math.abs(a - b);
        }
    }
} 
