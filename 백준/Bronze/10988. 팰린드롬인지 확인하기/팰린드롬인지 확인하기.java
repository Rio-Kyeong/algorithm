import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {

    public static void main(String[] args) {
        try (BufferedReader inputReader = new BufferedReader(new InputStreamReader(System.in))) {
            String originalString = inputReader.readLine().toLowerCase();
            boolean isPalindrome = checkPalindrome(originalString);

            System.out.println(isPalindrome ? 1 : 0);
        } catch (IOException | NumberFormatException e) {
            System.out.println(e.getMessage());
        }
    }

    private static boolean checkPalindrome(String originalString) {
        String reversedString = reverseString(originalString);

        return originalString.equals(reversedString);
    }

    private static String reverseString(String originalString) {
        StringBuilder reverseStringBuilder = new StringBuilder();

        for (int i = originalString.length() - 1; i >= 0; i--) {
            reverseStringBuilder.append(originalString.charAt(i));
        }

        return reverseStringBuilder.toString();
    }
}
