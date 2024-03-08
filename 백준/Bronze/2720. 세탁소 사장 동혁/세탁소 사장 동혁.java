import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {

    private static final int[] COIN_VALUES = {25, 10, 5, 1};

    public static void main(String[] args) {
        try (BufferedReader inputReader = new BufferedReader(new InputStreamReader(System.in))) {
            int testCase = Integer.parseInt(inputReader.readLine());
            StringBuilder changeBuilder = new StringBuilder();

            for (int i = 0; i < testCase; i++) {
                int amount = Integer.parseInt(inputReader.readLine());
                calculateChange(amount, changeBuilder);
            }

            System.out.print(changeBuilder);
        } catch (IOException | NumberFormatException e) {
            System.out.println(e.getMessage());
        }
    }
    
    private static void calculateChange(int amount, StringBuilder changeBuilder) {
        for (int coinValue : COIN_VALUES) {
            int coinCount = amount / coinValue;
            amount %= coinValue;
            changeBuilder.append(coinCount).append(" ");
        }
        changeBuilder.append("\n");
    }
}
