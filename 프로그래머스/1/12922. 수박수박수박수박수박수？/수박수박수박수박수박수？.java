class Solution {
    public String solution(int length) {
        StringBuilder builder = new StringBuilder(length);
        char[] stringPattern = {'수', '박'};

        for (int i = 0; i < length; i++) {
            builder.append(stringPattern[i % 2]);
        }

        return builder.toString();
    }
}
