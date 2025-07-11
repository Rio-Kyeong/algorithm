import java.util.*;
import java.lang.*;
import java.io.*;

class Main {

    private static final String PUSH = "push";
    private static final String POP = "pop";
    private static final String SIZE = "size";
    private static final String EMPTY = "empty";
    private static final String TOP = "top";

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        int N = Integer.parseInt(br.readLine());

        Stack<Integer> stack = new Stack<>();
        for (int i = 0; i < N; i++) {
            String[] input = br.readLine().split(" ");
            String command = input[0];

            switch (command) {
                case PUSH:
                    stack.push(Integer.parseInt(input[1]));
                    break;

                case POP:
                    bw.write((stack.isEmpty() ? -1 : stack.pop()) + "\n");
                    break;

                case SIZE:
                    bw.write(stack.size() + "\n");
                    break;

                case EMPTY:
                    bw.write((stack.isEmpty() ? 1 : 0) + "\n");
                    break;

                case TOP:
                    bw.write((stack.isEmpty() ? -1 : stack.peek()) + "\n");
                    break;
            }
        }

        bw.flush();
        bw.close();
        br.close();
    }
}
