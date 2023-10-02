import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Solution {
    public static void main(String[] args) throws IOException {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));

        StringTokenizer stringTokenizer = new StringTokenizer(bufferedReader.readLine());

        String string = stringTokenizer.nextToken();
        int count = Integer.parseInt(stringTokenizer.nextToken());

        for (int i = 0; i < count; i++) {
            System.out.print(string);
        }
    }
}
