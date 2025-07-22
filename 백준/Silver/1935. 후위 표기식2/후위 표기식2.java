import java.util.*;
import java.lang.*;
import java.io.*;

class Main {
    public static void main(String[] args) throws IOException {
        try (
                BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
                BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out))
        ) {
            int N = Integer.parseInt(br.readLine());
            String postfix = br.readLine();
            double[] values = new double[26];

            for (int i = 0; i < N; i++) {
                values[i] = Double.parseDouble(br.readLine());
            }

            Stack<Double> stack = new Stack<>();

            for (int i = 0; i < postfix.length(); i++) {
                char ch = postfix.charAt(i);

                if (Character.isLetter(ch)) {
                    stack.push(values[ch - 'A']);
                } else {
                    double a = stack.pop();
                    double b = stack.pop();

                    switch (ch) {
                        case '+':
                            stack.push(b + a);
                            break;
                        case '-':
                            stack.push(b - a);
                            break;
                        case '*':
                            stack.push(b * a);
                            break;
                        case '/':
                            stack.push(b / a);
                            break;
                    }
                }
            }

            bw.write(String.format("%.2f", stack.pop()));
            bw.flush();
        }
    }
}
