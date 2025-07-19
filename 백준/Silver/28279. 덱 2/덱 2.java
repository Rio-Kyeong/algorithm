import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) throws IOException {
        try (
            BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
            BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out))
        ) {
            Deque<Integer> deque = new ArrayDeque<>();
            int n = Integer.parseInt(br.readLine());

            for (int i = 0; i < n; i++) {
                StringTokenizer st = new StringTokenizer(br.readLine());
                String cmd = st.nextToken();

                switch (cmd) {
                    case "1": {
                        int x = Integer.parseInt(st.nextToken());
                        deque.addFirst(x);
                        break;
                    }
                    case "2": {
                        int x = Integer.parseInt(st.nextToken());
                        deque.addLast(x);
                        break;
                    }
                    case "3": {
                        bw.write(deque.isEmpty() ? "-1\n" : deque.pollFirst() + "\n");
                        break;
                    }
                    case "4": {
                        bw.write(deque.isEmpty() ? "-1\n" : deque.pollLast() + "\n");
                        break;
                    }
                    case "5": {
                        bw.write(deque.size() + "\n");
                        break;
                    }
                    case "6": {
                        bw.write(deque.isEmpty() ? "1\n" : "0\n");
                        break;
                    }
                    case "7": {
                        bw.write(deque.isEmpty() ? "-1\n" : deque.peekFirst() + "\n");
                        break;
                    }
                    case "8": {
                        bw.write(deque.isEmpty() ? "-1\n" : deque.peekLast() + "\n");
                        break;
                    }
                }
            }

            bw.flush();
        }
    }
}
