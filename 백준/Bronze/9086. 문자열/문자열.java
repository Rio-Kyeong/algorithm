import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.List;

public class Main {

    public static void main(String[] args) {
        try (BufferedReader inputReader = new BufferedReader(new InputStreamReader(System.in))) {
            int testCaseCount = Integer.parseInt(inputReader.readLine());
            List<String> resultString = new ArrayList<>();

            for (int i = 0; i < testCaseCount; i++) {
                String firstAndLastString = extractFirstAndLastChars(inputReader.readLine());
                resultString.add(firstAndLastString);
            }

            resultString.forEach(System.out::println);
        } catch (IOException | NumberFormatException e) {
            System.out.println(e.getMessage());
        }
    }

    public static String extractFirstAndLastChars(String testCase) {
        char firstChar = testCase.charAt(0);
        char lastChar = testCase.charAt(testCase.length() - 1);

        return String.valueOf(firstChar) + lastChar;
    }
}
