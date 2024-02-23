import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {

    public static void main(String[] args) {
        int sumPrice = 0;
        try (BufferedReader inputReader = new BufferedReader(new InputStreamReader(System.in))) {
            int x = Integer.parseInt(inputReader.readLine()); // 총 금액
            int n = Integer.parseInt(inputReader.readLine()); // 물건의 종류의 수
            StringTokenizer tokenizer;

            for (int i = 0; i < n; i++) {
                tokenizer = new StringTokenizer(inputReader.readLine(), " ");

                if (tokenizer.countTokens() > 3) {
                    throw new IllegalArgumentException("각 물건의 가격과 물건의 개수만 적어주세요.");
                }
                sumPrice += Integer.parseInt(tokenizer.nextToken()) * Integer.parseInt(tokenizer.nextToken());
            }

            System.out.println(sumPrice == x ? "Yes" : "No");
        } catch (IOException | NumberFormatException e) {
            System.out.println(e.getMessage());
        }
    }
}
