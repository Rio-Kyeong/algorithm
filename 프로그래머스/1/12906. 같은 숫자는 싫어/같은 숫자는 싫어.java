import java.util.Stack;

public class Solution {
    public int[] solution(int[] paramArray) {
        Stack<Integer> stack = new Stack<>();
        for (int element : paramArray) {
            if (stack.empty() || element != stack.peek()) {
                stack.push(element);
            }
        }

        int[] answer = new int[stack.size()];
        for (int i = answer.length - 1; i >= 0; i--) {
            answer[i] = stack.pop();
        }

        return answer;
    }
}
