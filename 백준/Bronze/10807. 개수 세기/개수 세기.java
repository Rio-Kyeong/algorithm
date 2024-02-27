import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.HashMap;
import java.util.Map;
import java.util.StringTokenizer;

public class Main {

    public static void main(String[] args) {
        try (BufferedReader inputReader = new BufferedReader(new InputStreamReader(System.in))) {
            int numberCount = Integer.parseInt(inputReader.readLine());
            StringTokenizer tokenizer = new StringTokenizer(inputReader.readLine(), " ");
            int findNumber = Integer.parseInt(inputReader.readLine());

            int[] numbers = new int[numberCount];
            int index = 0;
            while (tokenizer.hasMoreTokens()) {
                numbers[index] = Integer.parseInt(tokenizer.nextToken());
                index++;
            }

            Map<Integer, Integer> numberCountMap = new HashMap<>();
            for (int number : numbers) {
                Integer count = numberCountMap.getOrDefault(number, 0);
                numberCountMap.put(number, count + 1);
            }

            Integer countOfDesiredNumber = numberCountMap.getOrDefault(findNumber, 0);
            System.out.println(countOfDesiredNumber);
        } catch (IOException | NumberFormatException e) {
            System.out.println(e.getMessage());
        }
    }
}
