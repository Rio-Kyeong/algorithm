import java.util.*;
import java.lang.*;
import java.io.*;

class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int N = Integer.parseInt(br.readLine());

        StringBuilder resultBuilder = new StringBuilder();

        for (int i = 0; i < N; i++) {
            String[] parentheses = br.readLine().split("");
            int openCount = 0;
            boolean isBalanced = true;

            for (int j = 0; j < parentheses.length; j++) {
                if (parentheses[j].equals("(")) {
                    openCount++;
                }
                if (parentheses[j].equals(")")) {
                    if (openCount == 0) {
                        isBalanced = false;
                        break;
                    }
                    openCount--;
                }
            }

            if (isBalanced && openCount == 0) {
                resultBuilder.append("YES").append("\n");
            } else {
                resultBuilder.append("NO").append("\n");
            }
        }

        System.out.println(resultBuilder.toString());
    }
}
