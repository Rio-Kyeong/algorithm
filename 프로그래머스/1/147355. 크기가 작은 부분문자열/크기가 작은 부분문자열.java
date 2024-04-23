class Solution {
    public int solution(String t, String p) {
        int count = 0;
        
        for (int i = 0; i <= t.length() - p.length(); i++) {
            long substring = Long.parseLong(t.substring(i, i + p.length()));
            
            if (substring <= Long.parseLong(p)) {
                count++;
            }
        }

        return count;
    }
}
