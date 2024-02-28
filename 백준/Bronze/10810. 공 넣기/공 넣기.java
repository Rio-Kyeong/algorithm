import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {

    public static void main(String[] args) {
        try (BufferedReader inputReader = new BufferedReader(new InputStreamReader(System.in))) {
            StringTokenizer tokenizer = new StringTokenizer(inputReader.readLine(), " ");
            int basketCount = Integer.parseInt(tokenizer.nextToken());
            int putCount = Integer.parseInt(tokenizer.nextToken());

            int[] baskets = new int[basketCount];
            int index = 0;
            while (tokenizer.hasMoreTokens()) {
                baskets[index] = Integer.parseInt(tokenizer.nextToken());
                index++;
            }

            for (int i = 0; i < putCount; i++) {
                tokenizer = new StringTokenizer(inputReader.readLine(), " ");
                int firstBasket = Integer.parseInt(tokenizer.nextToken());
                int lastBasket = Integer.parseInt(tokenizer.nextToken());
                int ballNumber = Integer.parseInt(tokenizer.nextToken());

                addToBasket(firstBasket, lastBasket, ballNumber, baskets);
            }

            StringBuilder ballNumberStringBuilder = new StringBuilder();
            for (int ball : baskets) {
                ballNumberStringBuilder.append(ball).append(" ");
            }
            System.out.println(ballNumberStringBuilder.toString().trim());
        } catch (IOException | NumberFormatException e) {
            System.out.println(e.getMessage());
        }
    }

    public static void addToBasket(int firstBasket, int lastBasket, int ballNumber, int[] baskets) {
        for (int i = firstBasket - 1; i < lastBasket; i++) {
            baskets[i] = ballNumber;
        }
    }
}
