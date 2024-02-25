import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {

    public static void main(String[] args) {
        try (BufferedReader inputReader = new BufferedReader(new InputStreamReader(System.in))) {
            StringTokenizer tokenizer = new StringTokenizer(inputReader.readLine(), " ");
            int lastBallNumber = Integer.parseInt(tokenizer.nextToken());
            int changeNumber = Integer.parseInt(tokenizer.nextToken());

            int[] result = new int[lastBallNumber];
            for (int i = 0; i < result.length; i++) {
                result[i] = i + 1;
            }

            for (int i = 0; i < changeNumber; i++) {
                tokenizer = new StringTokenizer(inputReader.readLine(), " ");
                int firstIndex = Integer.parseInt(tokenizer.nextToken());
                int secondIndex = Integer.parseInt(tokenizer.nextToken());

                swapBall(result, firstIndex - 1, secondIndex - 1);
            }

            for (int i : result) {
                System.out.print(i + " ");
            }
        } catch (IOException | NumberFormatException e) {
            System.out.println(e.getMessage());
        }
    }

    private static void swapBall(int[] array, int firstIndex, int secondIndex) {
        int tempValue = array[firstIndex];
        array[firstIndex] = array[secondIndex];
        array[secondIndex] = tempValue;
    }
}
