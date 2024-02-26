

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int m = Integer.parseInt(br.readLine());
        int n = Integer.parseInt(br.readLine());

        int cnt = 0;
        int sum = 0;
        int min = n;

        for(int i = m; i <= n; i++){
            for(int j =2; j <= i; j++){
                if(i%j == 0){
                    cnt++;
                }
            }

            if(cnt == 1){
                if(i <= min){
                    min = i;
                }
                sum += i;
            }
            cnt = 0;
        }
        if(sum != 0){
            System.out.println(sum);
            System.out.println(min);
        }else {
            System.out.println(-1);
        }

    }
}
