import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.StringTokenizer;

/**
 * ATM
 */
public class Main {

    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int n = Integer.parseInt(br.readLine());

        int idx = 0;
        int sum = 0;

        int[] arr = new int[n];

        StringTokenizer st = new StringTokenizer(br.readLine(), " ");

        for(int i = 0; i < n; i++){
            arr[i] = Integer.parseInt(st.nextToken());
        }
        Arrays.sort(arr);
        
        for(int i = 0; i < n; i++){
            idx += arr[i]; // 1 3 6 9 13
            sum += idx;
        }
        System.out.println(sum);
    }
}