class Solution {
    public double solution(int[] arr) {
        int sum = 0;
        int arrayLength = arr.length;

        for (int i : arr) {
            sum += i;
        }

        return (double) sum / arrayLength;
    }
}