import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {

    public static void main(String[] args) {
        try (BufferedReader inputReader = new BufferedReader(new InputStreamReader(System.in))) {
            String inputString = inputReader.readLine();
            int index = Integer.parseInt(inputReader.readLine());

            char[] chars = inputString.toCharArray();
            char result = chars[index - 1];

            System.out.println(result);
        } catch (IOException | NumberFormatException e) {
            System.out.println(e.getMessage());
        }
    }
}
