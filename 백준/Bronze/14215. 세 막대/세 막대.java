import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {

    public static void main(String[] args) {
        try (BufferedReader inputReader = new BufferedReader(new InputStreamReader(System.in))) {
            StringTokenizer tokenizer = new StringTokenizer(inputReader.readLine(), " ");
            int firstBar = Integer.parseInt(tokenizer.nextToken());
            int secondBar = Integer.parseInt(tokenizer.nextToken());
            int thirdBar = Integer.parseInt(tokenizer.nextToken());

            int total = firstBar + secondBar + thirdBar;
            int longestBar = Math.max(Math.max(firstBar, secondBar), thirdBar);
            int sumOtherSides = total - longestBar;

            if (longestBar < sumOtherSides) {
                System.out.println(total);
            } else {
                System.out.println(sumOtherSides + (sumOtherSides - 1));
            }
        } catch (IOException | NumberFormatException e) {
            System.out.println(e.getMessage());
        }
    }
}
