class Solution {
    public static int solution(int[] num_list) {
        int even = 0;
        int odd = 0;

        for (int i = 0; i < num_list.length; i++) {
            int currentSum = (i + 1) % 2 == 0 ? (even += num_list[i]) : (odd += num_list[i]);
        }

        return Math.max(even, odd);
    }
}
