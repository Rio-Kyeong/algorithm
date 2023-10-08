class Solution {
public static int solution(int a, int b) {
        String firstOperand = Integer.toString(a).concat(Integer.toString(b));
        String secondOperand = Integer.toString(b).concat(Integer.toString(a));

        return Integer.max(Integer.parseInt(firstOperand), Integer.parseInt(secondOperand));
    }
}
