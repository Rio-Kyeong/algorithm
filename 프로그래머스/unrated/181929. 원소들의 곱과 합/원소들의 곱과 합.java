class Solution {
    public static int solution(int[] num_list) {
        int multiplication = 1;
        int addition = 0;

        for (int number : num_list) {
            multiplication *= number;
            addition += number;
        }

        return multiplication < Math.pow(addition, 2) ? 1 : 0;
    }
}
