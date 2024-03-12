import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Main {

    private static final String EQUALS = " = ";
    private static final String PLUS = " + ";
    private static final String IS_NOT_PERFECT = " is NOT perfect.";

    public static void main(String[] args) {
        try (BufferedReader inputReader = new BufferedReader(new InputStreamReader(System.in))) {
            StringBuilder resultBuilder = new StringBuilder();

            while (true) {
                int inputNumber = Integer.parseInt(inputReader.readLine());

                if (inputNumber == -1) {
                    break;
                }

                if (isPerfectNumber(inputNumber)) {
                    resultBuilder.append(printPerfectNumber(inputNumber)).append("\n");
                } else {
                    resultBuilder.append(inputNumber).append(IS_NOT_PERFECT).append("\n");
                }
            }

            System.out.println(resultBuilder);
        } catch (IOException | NumberFormatException e) {
            System.out.println(e.getMessage());
        }
    }

    private static boolean isPerfectNumber(int number) {
        int sum = 1;
        for (int i = 2; i <= Math.sqrt(number); i++) {
            if (number % i == 0) {
                sum += i;
                if (i != number / i) {
                    sum += number / i;
                }
            }
        }

        return sum == number;
    }

    private static String printPerfectNumber(int number) {
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder
                .append(number).append(EQUALS)
                .append(1);

        List<Integer> divisors = new ArrayList<>();
        for (int i = 2; i <= Math.sqrt(number); i++) {
            if (number % i == 0) {
                divisors.add(i);
                if (i != number / i) {
                    divisors.add(number / i);
                }
            }
        }

        Collections.sort(divisors);

        for (Integer divisor : divisors) {
            stringBuilder.append(PLUS).append(divisor);
        }

        return stringBuilder.toString();
    }
}
