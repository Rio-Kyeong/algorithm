import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.StringTokenizer;

public class Main {

    public static void main(String[] args) {
        try (BufferedReader inputReader = new BufferedReader(new InputStreamReader(System.in))) {
            StringTokenizer tokenizer = new StringTokenizer(inputReader.readLine(), " ");
            int baskets = Integer.parseInt(tokenizer.nextToken());
            int changeNumber = Integer.parseInt(tokenizer.nextToken());

            int[] result = new int[baskets];
            for (int i = 0; i < result.length; i++) {
                result[i] = i + 1;
            }

            for (int i = 0; i < changeNumber; i++) {
                tokenizer = new StringTokenizer(inputReader.readLine(), " ");
                int startIndex = Integer.parseInt(tokenizer.nextToken());
                int endIndex = Integer.parseInt(tokenizer.nextToken());

                reverseOrderBall(result, startIndex - 1, endIndex - 1);
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

    private static void reverseOrderBall(int[] array, int startIndex, int endIndex) {
        int[] subArray = Arrays.copyOfRange(array, startIndex, endIndex + 1);

        for (int i = startIndex, j = subArray.length - 1; i <= endIndex; i++, j--) {
            array[i] = subArray[j];
        }
    }
}
