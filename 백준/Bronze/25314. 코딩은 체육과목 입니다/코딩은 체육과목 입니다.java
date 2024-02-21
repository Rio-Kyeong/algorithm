import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {

    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(reader.readLine());
        StringBuilder result = new StringBuilder();

        String dataType = "long";
        String finalDataType = "int";

        for (int i = 0; i < n / 4; i++) {
            result.append(dataType).append(" ");
        }
        result.append(finalDataType);

        System.out.println(result);
    }
}