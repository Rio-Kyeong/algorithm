import java.util.*;

public class Solution {

    public static void main(String[] args) {
        Solution solution = new Solution();
    }

    public int solution1() {
        String data = "aka23ksuf9jtemp729temp";
        String[] temps = data.split("temp");

        return temps.length;
    }

    public String solution2() {
        String data = "5, 3, 1, X, 6";
        String[] splitData = data.split(", ");
        String[] result = Arrays.stream(splitData)
                .filter(s -> {
                    try {
                        Integer.parseInt(s);
                        return true;
                    } catch (NumberFormatException e) {
                        return false;
                    }
                })
                .sorted()
                .toArray(String[]::new);

        return Arrays.toString(result);
    }

    public int solution3() {
        String data = "139nsk6n_j090kw7";
        char[] dataCharArray = data.toCharArray();

        int result = 0;
        StringBuilder currentNumber = new StringBuilder(0);

        for (int i = 0; i < dataCharArray.length; i++) {
            if (Character.isDigit(dataCharArray[i])) {
                currentNumber.append(dataCharArray[i]);
            } else {
                if (!currentNumber.isEmpty()) {
                    result += Integer.parseInt(currentNumber.toString());
                    currentNumber.setLength(0);
                }
            }

            if (i == dataCharArray.length - 1 && !currentNumber.isEmpty()) {
                System.out.println(Integer.parseInt(currentNumber.toString()));
                result += Integer.parseInt(currentNumber.toString());
            }
        }

        return result;
    }

    public String solution4(char data, int index) {
        String alphabet = "A C Y E O W B";

        List<String> list = new ArrayList<>(Arrays.asList(alphabet.split(" ")));

        if (list.contains(String.valueOf(data))) {
            list.remove(String.valueOf(data));
            list.add(index, String.valueOf(data));
        }

        return list.toString();
    }
}
