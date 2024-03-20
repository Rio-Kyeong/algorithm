import java.util.ArrayList;

class Solution {
    public ArrayList<Integer> solution(long number) {
        ArrayList<Integer> answer = new ArrayList<>();

        while (number > 0) {
            answer.add((int) (number % 10));
            number /= 10;
        }
        
        return answer;
    }
}
