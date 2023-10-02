import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Solution {
    public static void main(String[] args) throws IOException {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));

        StringTokenizer stringTokenizer = new StringTokenizer(bufferedReader.readLine());

        int num1 = Integer.parseInt(stringTokenizer.nextToken());
        int num2 = Integer.parseInt(stringTokenizer.nextToken());

        System.out.println(num1 + " + " + num2 + " = " + (num1 + num2));
    }
}
