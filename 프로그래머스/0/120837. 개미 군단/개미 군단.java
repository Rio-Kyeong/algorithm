class Solution {
    public int solution(int hp) {
        int answer = 0;
        
        int[] antPowers = {5, 3, 1};

        for (int power : antPowers) {
            answer += hp / power;
            hp %= power;
        }

        return answer;
    }
}