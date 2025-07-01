import java.util.*;
import java.lang.*;
import java.io.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());

        int hourLimit = Integer.parseInt(st.nextToken());
        String target = st.nextToken();

        int count = 0;
        
        for (int hour = 0; hour <= hourLimit; hour++) {
            for (int minute = 0; minute < 60; minute++) {
                for (int second = 0; second < 60; second++) {
                    String time = String.format("%02d%02d%02d", hour, minute, second);
                    if (time.contains(target)) {
                        count++;
                    }
                }
            }
        }

        System.out.println(count);
    }
}
