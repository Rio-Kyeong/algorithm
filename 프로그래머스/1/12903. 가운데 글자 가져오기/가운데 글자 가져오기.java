class Solution {
    public String solution(String string) {
        boolean isEven = string.length() % 2 == 0;
        int middleIndex = string.length() / 2;

        if (isEven) {
            return string.substring(middleIndex - 1, middleIndex + 1);
        } else {
            return String.valueOf(string.charAt(middleIndex));
        }
    }
}
