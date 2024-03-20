class Solution {
    public boolean solution(String string) {
        if (string == null) {
            return true;
        }

        int countP = 0;
        int countY = 0;
        string = string.toLowerCase();
        
        for (char word : string.toCharArray()) {
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
