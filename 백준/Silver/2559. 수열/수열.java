import java.util.*;
import java.lang.*;
import java.io.*;

class Main {
    public static void main(String[] args) throws IOException {
        try (
                BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
                BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out))
        ) {
            StringTokenizer tokenizer = new StringTokenizer(br.readLine());
            int N = Integer.parseInt(tokenizer.nextToken());
            int K = Integer.parseInt(tokenizer.nextToken());

            int[] temperature = new int[N];
            tokenizer = new StringTokenizer(br.readLine());
            for (int i = 0; i < N; i++) {
                temperature[i] = Integer.parseInt(tokenizer.nextToken());
            }

            int answer = Integer.MIN_VALUE;

            for (int i = 0; i <= N - K; i++) {
                int sum = 0;
                for (int j = i; j < i + K; j++) {
                    sum += temperature[j];
                }
                answer = Math.max(answer, sum);
            }

            bw.write(String.valueOf(answer));
            bw.flush();
        }
    }
}
