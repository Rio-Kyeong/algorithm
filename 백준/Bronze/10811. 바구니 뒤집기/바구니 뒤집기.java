import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {

    public static void main(String[] args) {
        try (BufferedReader inputReader = new BufferedReader(new InputStreamReader(System.in))) {
            StringTokenizer tokenizer = new StringTokenizer(inputReader.readLine(), " ");
            int basketCount = Integer.parseInt(tokenizer.nextToken());
            int changeCount = Integer.parseInt(tokenizer.nextToken());

            int[] result = new int[basketCount];
            for (int i = 0; i < result.length; i++) {
                result[i] = i + 1;
            }

            for (int i = 0; i < changeCount; i++) {
                tokenizer = new StringTokenizer(inputReader.readLine(), " ");
                int startIndex = Integer.parseInt(tokenizer.nextToken()) - 1;
                int endIndex = Integer.parseInt(tokenizer.nextToken()) - 1;

                reverseOrderBalls(result, startIndex, endIndex);
            }

            StringBuilder resultBuilder = new StringBuilder();
            for (int i : result) {
                resultBuilder.append(i).append(" ");
            }

            System.out.println(resultBuilder.toString().trim());
        } catch (IOException | NumberFormatException e) {
            System.out.println(e.getMessage());
        }
    }

    private static void reverseOrderBalls(int[] array, int startIndex, int endIndex) {
        while (startIndex < endIndex) {
            int temp = array[startIndex];
            array[startIndex] = array[endIndex];
            array[endIndex] = temp;
            startIndex++;
            endIndex--;
        }
    }
}
