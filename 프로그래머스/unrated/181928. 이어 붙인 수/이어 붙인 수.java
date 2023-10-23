class Solution {
    public static int solution(int[] num_list) {
        int even = 0;
        int odd = 0;

        for (int number : num_list) {
            if (number % 2 == 0) {
                even *= 10;
                even += number;
            } else {
                odd *= 10;
                odd += number;
            }
        }

        return even + odd;
    }
}
