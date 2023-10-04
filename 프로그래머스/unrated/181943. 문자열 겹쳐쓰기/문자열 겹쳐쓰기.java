class Solution {
    public static String solution(String my_string, String overwrite_string, int s) {
        String answer = "";
        String prefix_string = my_string.substring(0, s);
        String suffix_string = my_string.substring(s + overwrite_string.length());
        
        answer = prefix_string + overwrite_string + suffix_string;

        return answer;
    }
}
