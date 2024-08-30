import java.util.*;

class Solution {
    public Long solution(String numbers) {
        StringBuilder result = new StringBuilder();
        Map<String, String> numbersMap = createNumbers();

        while (!numbers.isEmpty()) {
            for (String number : numbersMap.keySet()) {
                if (numbers.startsWith(number)) {
                    result.append(numbersMap.get(number));
                    numbers = numbers.substring(number.length());
                    break;
                }
            }
        }

        return Long.parseLong(result.toString());
    }

    private Map<String, String> createNumbers() {
        Map<String, String> numbers = new HashMap<>();
        numbers.put("zero", "0");
        numbers.put("one", "1");
        numbers.put("two", "2");
        numbers.put("three", "3");
        numbers.put("four", "4");
        numbers.put("five", "5");
        numbers.put("six", "6");
        numbers.put("seven", "7");
        numbers.put("eight", "8");
        numbers.put("nine", "9");

        return numbers;
    }
}
