class Solution {
    public String solution(String phoneNumber) {
        int length = phoneNumber.length();
        if (length < 4 || length > 20) {
            throw new IllegalArgumentException("phoneNumber는 길이 4 이상, 20이하인 문자열입니다.");
        }
        
        return "*".repeat(length - 4) + phoneNumber.substring(length - 4);
    }
}
