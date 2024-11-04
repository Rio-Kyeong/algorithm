class Solution {
    
    private static final int LAMB_SKEWERS = 12000;
    private static final int BEVERAGE = 2000;
    private static final int FREE_BEVERAGE_THRESHOLD = 10;
    
    public int solution(int n, int k) {
        int freeBeverages = n / FREE_BEVERAGE_THRESHOLD;
        int answer = (LAMB_SKEWERS * n) + (BEVERAGE * k) - (BEVERAGE * freeBeverages);
        
        return answer;
    }
}