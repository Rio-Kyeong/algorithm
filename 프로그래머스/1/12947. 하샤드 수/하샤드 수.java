class Solution {
        public boolean solution(int paramNumber) {
        if (paramNumber < 1 || paramNumber > 10000) {
            throw new IllegalArgumentException("입력된 수, number는 1 이상, 10000 이하인 정수입니다.");
        }

        int sum = 0;
        int number = paramNumber;
        while (number != 0) {
            sum += number % 10;
            number /= 10;
        }
        
        return paramNumber % sum == 0;
    }
}
