import java.util.Stack;

class Solution {
    public boolean solution(String s) {
        Stack<Character> stack = new Stack<>();

        for (char parentheses : s.toCharArray()) {
            if (parentheses == '(') {
                stack.push(parentheses);
            }
            if (parentheses == ')') {
                if (stack.isEmpty()) {
                    return false;
                }
                stack.pop();
            }
        }

        return stack.isEmpty();
    }
}
