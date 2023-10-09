class Solution {
    public static int solution(int a, int b) {
        int firstOperand = Integer.parseInt(Integer.toString(a).concat(Integer.toString(b)));
        int secondOperand = 2 * a * b;

        return Integer.max(firstOperand, secondOperand);
    }
}
