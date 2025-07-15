import java.util.*;
import java.lang.*;
import java.io.*;

class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int N = Integer.parseInt(br.readLine());

        int[][] coordinates = new int[N][2];

        for(int i = 0; i < N; i++) {
            StringTokenizer tokenizer = new StringTokenizer(br.readLine());
            coordinates[i][0] = Integer.parseInt(tokenizer.nextToken());
            coordinates[i][1] = Integer.parseInt(tokenizer.nextToken());
        }

        Arrays.sort(coordinates, (a, b) -> {
            if(a[0] == b[0]) {
                return a[1] - b[1];
            } else {
                return a[0] - b[0];
            }
        });

        for(int i = 0; i < N; i++) {
            System.out.println(coordinates[i][0] + " " + coordinates[i][1]);
        }
    }
}
