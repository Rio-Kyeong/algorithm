import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Solution {
    public static void main(String[] args) throws IOException {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));

        char[] charArray = bufferedReader.readLine().toCharArray();

        StringBuilder result = new StringBuilder();

        for (char c : charArray) {
            if (Character.isUpperCase(c)) {
                result.append(Character.toLowerCase(c));
            }
            if (Character.isLowerCase(c)) {
                result.append(Character.toUpperCase(c));
            }
        }

        System.out.println(result);
    }
}
