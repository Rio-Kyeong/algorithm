import java.util.*;
import java.lang.*;
import java.io.*;

class Main {
    public static void main(String[] args) throws IOException {
        try (
            BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
            BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out))
        ) {
            StringBuilder stringBuilder = new StringBuilder();

            String inputText;
            while (!(inputText = br.readLine()).equals(".")) {
                Stack<Character> stack = new Stack<>();
                boolean isBalanced = true;

                for (char ch : inputText.toCharArray()) {
                    if (ch == '(' || ch == '[') {
                        stack.push(ch);
                    }
                    if (ch == ')') {
                        if (stack.isEmpty() || stack.pop() != '(') {
                            isBalanced = false;
                            break;
                        }
                    }
                    if (ch == ']') {
                        if (stack.isEmpty() || stack.pop() != '[') {
                            isBalanced = false;
                            break;
                        }
                    }
                }

                if (!stack.isEmpty()) {
                    isBalanced = false;
                }

                stringBuilder.append(isBalanced ? "yes\n" : "no\n");
            }

            bw.write(stringBuilder.toString());
            bw.flush();
        }
    }
}
