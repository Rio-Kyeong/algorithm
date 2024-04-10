class Solution {
    public long solution(int price, int money, int count) {
        long paymentAmount = 0;

        for (int i = 1; i <= count; i++) {
            paymentAmount += (long) price * i;
        }

        return paymentAmount > money ? paymentAmount - money : 0;
    }
}
