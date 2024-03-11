import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {

    private static final String FACTOR = "factor";
    private static final String MULTIPLE = "multiple";
    private static final String NEITHER = "neither";

    public static void main(String[] args) {
        try (BufferedReader inputReader = new BufferedReader(new InputStreamReader(System.in))) {
            StringBuilder resultBuilder = new StringBuilder();

            while (true) {
                StringTokenizer tokenizer = new StringTokenizer(inputReader.readLine(), " ");
                int firstNumber = Integer.parseInt(tokenizer.nextToken());
                int secondNumber = Integer.parseInt(tokenizer.nextToken());

                if (firstNumber == 0 && secondNumber == 0) {
                    break;
                }
                resultBuilder.append(checkMultipleOrFactor(firstNumber, secondNumber)).append("\n");
            }

            System.out.println(resultBuilder);
        } catch (IOException | NumberFormatException e) {
            System.out.println(e.getMessage());
        }
    }

    private static String checkMultipleOrFactor(int firstNumber, int secondNumber) {
        if ((firstNumber < secondNumber) && (secondNumber % firstNumber == 0)) {
            return FACTOR;
        }
        if ((firstNumber > secondNumber) && (firstNumber % secondNumber == 0)) {
            return MULTIPLE;
        }
        return NEITHER;
    }
}
