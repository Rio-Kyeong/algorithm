class Solution {
    public long solution(long number) {
        long sqrt = (long) Math.sqrt(number);

        return sqrt * sqrt == number ? (long) Math.pow(sqrt + 1, 2) : -1;
    }
}
