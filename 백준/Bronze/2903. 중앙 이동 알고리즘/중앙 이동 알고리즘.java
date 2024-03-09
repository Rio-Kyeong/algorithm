import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {

    public static void main(String[] args) {
        try (BufferedReader inputReader = new BufferedReader(new InputStreamReader(System.in))) {
            int steps = Integer.parseInt(inputReader.readLine());
            int initialWidth = 2;
            int totalPoints = 0;

            for (int i = 0; i < steps; i++) {
                initialWidth = (2 * initialWidth) - 1;
                totalPoints = initialWidth * initialWidth;
            }

            System.out.println(totalPoints);
        } catch (IOException | NumberFormatException e) {
            System.out.println(e.getMessage());
        }
    }
}
