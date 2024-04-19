import java.util.Arrays;

class Solution {
    public String solution(String string) {
        char[] characterArray = string.toCharArray();
        boolean isUpperCase = true;

        for (int i = 0; i < string.length(); i++) {
            if (characterArray[i] == ' ') {
                isUpperCase = true;
            } else {
                characterArray[i] = isUpperCase ? Character.toUpperCase(characterArray[i]) : Character.toLowerCase(characterArray[i]);
                isUpperCase = !isUpperCase;
            }
        }

        return new String(characterArray);
    }
}
