import java.util.*;
import java.lang.*;
import java.io.*;

class Main {
    public static void main(String[] args) throws IOException {
        try (
            BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
            BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out))
        ) {
            char[] infixNotation = br.readLine().toCharArray();
            Stack<Character> stack = new Stack<>();
            StringBuilder result = new StringBuilder();

            int index = 0;
            for (char ch : infixNotation) {
                if (Character.isLetter(ch)) {
                    result.append(ch);
                } else if (ch == '(') {
                    stack.push(ch);
                } else if (ch == ')') {
                    while (!stack.isEmpty() && stack.peek() != '(') {
                        result.append(stack.pop());
                    }
                    if (!stack.isEmpty()) {
                        stack.pop();
                    }
                } else {
                    while (!stack.isEmpty() && getPriority(stack.peek()) >= getPriority(ch)) {
                            result.append(stack.pop());
                    }
                    stack.push(ch);
                }
            }

            if (!stack.isEmpty()) {
                while (!stack.isEmpty()) {
                    result.append(stack.pop());
                }
            }

            bw.write(result.toString());
            bw.flush();
        }
    }

    private static int getPriority(char operator) {
        switch (operator) {
            case '+':
            case '-':
                return 1;
            case '*':
            case '/':
                return 2;
            case '(':
                return 0;
            default:
                return -1;
        }
    }
}
