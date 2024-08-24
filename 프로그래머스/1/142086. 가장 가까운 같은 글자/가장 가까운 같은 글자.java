import java.util.HashMap;
import java.util.Map;

class Solution {
    public static int[] solution(String s) {
        int[] answer = new int[s.length()];
        Map<Character, Integer> lastSeen = new HashMap<>();

        for (int i = 0; i < s.length(); i++) {
            char currentChar = s.charAt(i);

            if (!lastSeen.containsKey(currentChar)) {
                answer[i] = -1;
            } else {
                answer[i] = i - lastSeen.get(currentChar);
            }

            lastSeen.put(currentChar, i);
        }

        return answer;
    }
}
