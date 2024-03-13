import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {

    public static void main(String[] args) {
        try (BufferedReader inputReader = new BufferedReader(new InputStreamReader(System.in))) {
            int length = Integer.parseInt(inputReader.readLine());
            int width = Integer.parseInt(inputReader.readLine());

            System.out.println(calculateArea(length, width));
        } catch (IOException | NumberFormatException e) {
            System.out.println(e.getMessage());
        }
    }

    private static int calculateArea(int length, int width) {
        return length * width;
    }
}
