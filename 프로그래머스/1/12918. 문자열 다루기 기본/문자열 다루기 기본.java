class Solution {
    public boolean solution(String string) {
        int length = string.length();

        if (length != 4 && length != 6) {
            return false;
        }

        for (int i = 0; i < length; i++) {
            if (!Character.isDigit(string.charAt(i))) {
                return false;
            }
        }

        return true;
    }
}
