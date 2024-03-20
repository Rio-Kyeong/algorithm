class Solution {
    public boolean solution(String string) {
        int countP = 0;
        int countY = 0;

        for (char word : string.toLowerCase().toCharArray()) {
            if (word == 'p') {
                countP++;
            }
            if (word == 'y') {
                countY++;
            }
        }
        
        return countP == countY;
    }
}