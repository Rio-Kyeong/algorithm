class Solution {
    public static int solution(int[] num_list) {
        StringBuilder even = new StringBuilder();
        StringBuilder odd = new StringBuilder();

        for (int number : num_list) {
            if (number % 2 == 0) {
                even.append(number);
            } else {
                odd.append(number);
            }
        }

        return Integer.parseInt(even.toString()) + Integer.parseInt(odd.toString());
    }
}