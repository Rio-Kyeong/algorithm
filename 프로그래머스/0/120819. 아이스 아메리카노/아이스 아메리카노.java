class Solution {
    public int[] solution(int money) {
        final int AMERICANO_PRICE = 5500;

        int numberOfAmericanos = money / AMERICANO_PRICE;
        int remainingMoney = money % AMERICANO_PRICE;

        return new int[]{numberOfAmericanos, remainingMoney};
    }
}