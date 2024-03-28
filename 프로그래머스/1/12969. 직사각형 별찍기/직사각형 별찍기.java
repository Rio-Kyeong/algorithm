import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

class Solution {
    public static void main(String[] args) {
        try(BufferedReader reader = new BufferedReader(new InputStreamReader(System.in))) {
            String[] inputString = reader.readLine().split(" ");
            int width = Integer.parseInt(inputString[0]);
            int height = Integer.parseInt(inputString[1]);
            StringBuilder builder = new StringBuilder();

            for (int i = 0; i < height; i++) {
                builder.append("*".repeat(Math.max(0, width)));
                builder.append("\n");
            }

            System.out.println(builder);
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }
}
