import java.util.*;

class Solution {
    public int solution(int[] priorities, int location) {
        int answer = 0;
        
        Queue<Integer> queue = new LinkedList<>();
        for(int i=0; i<priorities.length; i++) {
            queue.add(i);
        }
        
        while(!queue.isEmpty()) {
            int beforeSize = queue.size();
            int top = queue.poll();
            
            for(int index : queue) {
                if(priorities[index] > priorities[top]) {
                    queue.add(top);
                    break;
                }
            }

            if(beforeSize != queue.size()) {
                answer++;
                if (top == location) return answer;
            }
        }

        return answer;
    }
}