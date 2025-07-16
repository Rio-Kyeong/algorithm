import java.util.*;
import java.lang.*;
import java.io.*;

class Main {

    private static final String PUSH = "push";
    private static final String POP = "pop";
    private static final String SIZE = "size";
    private static final String EMPTY = "empty";
    private static final String FRONT = "front";
    private static final String BACK = "back";

    public static void main(String[] args)  throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        int N = Integer.parseInt(br.readLine());

        Queue<Integer> queue = new LinkedList<>();

        for (int i = 0; i < N; i++) {
            String[] inputText = br.readLine().split(" ");
            String command = inputText[0];

            switch (command) {
                case PUSH:
                    queue.offer(Integer.parseInt(inputText[1]));
                    break;
                case POP:
                    bw.write((queue.isEmpty() ? -1 : queue.poll()) + "\n");
                    break;
                case SIZE:
                    bw.write(queue.size() + "\n");
                    break;
                case EMPTY:
                    bw.write((queue.isEmpty() ? 1 : 0) + "\n");
                    break;
                case FRONT:
                    bw.write((queue.isEmpty() ? -1 : queue.element()) + "\n");
                    break;
                case BACK:
                    bw.write((queue.isEmpty() ? -1 : ((LinkedList<Integer>) queue).peekLast()) + "\n");
                    break;
            }
        }

        bw.flush();
        bw.close();
        br.close();
    }
}
