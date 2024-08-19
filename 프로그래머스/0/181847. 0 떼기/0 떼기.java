class Solution {
    public String solution(String n_str) {
        int firstNonZeroIndex = 0;
        
        while (firstNonZeroIndex < n_str.length() && n_str.charAt(firstNonZeroIndex) == '0') {
            firstNonZeroIndex++;
        }
        
        return n_str.substring(firstNonZeroIndex);
    }
}
