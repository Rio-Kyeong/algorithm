import java.util.HashMap;
import java.util.Map;

class Solution {
    public int solution(String string) {
        Map<String, Integer> numberMap = createMapping();
        StringBuilder resultBuilder = new StringBuilder();

        int index = 0;
        while (string.length() > index) {
            if (Character.isDigit(string.charAt(index))) {
                resultBuilder.append(string.charAt(index));
                index++;
            } else {
                StringBuilder wordBuilder = new StringBuilder();
                while (string.length() > index && !Character.isDigit(string.charAt(index))) {
                    wordBuilder.append(string.charAt(index));
                    if (numberMap.containsKey(wordBuilder.toString())) {
                        resultBuilder.append(numberMap.get(wordBuilder.toString()));
                        wordBuilder.setLength(0);
                    }
                    index++;
                }
            }
        }

        return Integer.parseInt(resultBuilder.toString());
    }

    private Map<String, Integer> createMapping() {
        Map<String, Integer> map = new HashMap<>();
        map.put("zero", 0);
        map.put("one", 1);
        map.put("two", 2);
        map.put("three", 3);
        map.put("four", 4);
        map.put("five", 5);
        map.put("six", 6);
        map.put("seven", 7);
        map.put("eight", 8);
        map.put("nine", 9);

        return map;
    }
}
