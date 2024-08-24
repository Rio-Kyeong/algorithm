class Solution {
    public int solution(int num, int k) {
        String numberAsString = String.valueOf(num);
        int targetIndex = numberAsString.indexOf(String.valueOf(k));

        return targetIndex == -1 ? -1 : targetIndex + 1;
    }
}
