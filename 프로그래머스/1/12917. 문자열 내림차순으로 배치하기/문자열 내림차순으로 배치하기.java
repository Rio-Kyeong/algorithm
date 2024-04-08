import java.util.Arrays;
import java.util.Comparator;
import java.util.stream.Collectors;

class Solution {
    public String solution(String string) {
        Character[] characters = new Character[string.length()];
        for (int i = 0; i < characters.length; i++) {
            characters[i] = string.charAt(i);
        }

        Arrays.sort(characters, Comparator.reverseOrder());

        return Arrays.stream(characters)
                .map(String::valueOf)
                .collect(Collectors.joining());
    }
}
