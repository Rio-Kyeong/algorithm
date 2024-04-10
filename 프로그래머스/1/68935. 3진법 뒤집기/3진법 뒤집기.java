class Solution {
    public int solution(int number) {
        StringBuilder trinary = new StringBuilder();
        while (number > 0) {
            trinary.insert(0, number % 3);
            number /= 3;
        }

        String trinaryReversed = trinary.reverse().toString();

        return Integer.parseInt(trinaryReversed, 3);
    }
}
