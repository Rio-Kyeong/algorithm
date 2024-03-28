class Solution {
    public int[] solution(int number1, int number2) {
        int gcd = gcd(number1, number2);
        int lcm = lcm(number1, number2, gcd);

        return new int[]{gcd, lcm};
    }

    private int gcd(int number1, int number2) {
        while (number2 != 0) {
            int temp = number1 % number2;
            number1 = number2;
            number2 = temp;
        }

        return number1;
    }

    private int lcm(int number1, int number2, int gcd) {
        return (number1 * number2) / gcd;
    }
}
