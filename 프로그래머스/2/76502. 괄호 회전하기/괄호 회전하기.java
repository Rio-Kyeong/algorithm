import java.util.Stack;

class Solution {
    public static boolean isValidParentheses(String s) {
        Stack<Character> stack = new Stack<>();
        for (char c : s.toCharArray()) {
            if (c == '(' || c == '[' || c == '{') {
                stack.push(c);
            } else {
                if (stack.isEmpty()) return false;
                char top = stack.pop();
                if ((c == ')' && top != '(') || 
                    (c == ']' && top != '[') || 
                    (c == '}' && top != '{')) {
                    return false;
                }
            }
        }
        return stack.isEmpty();
    }
    
    public static int solution(String s) {
        int count = 0;
        int n = s.length();
        
        for (int x = 0; x < n; x++) {
            String rotated = s.substring(x) + s.substring(0, x);
            if (isValidParentheses(rotated)) {
                count++;
            }
        }
        
        return count;
    }
}
