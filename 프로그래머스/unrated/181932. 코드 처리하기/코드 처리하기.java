class Solution {
    public static String solution(String code) {
        StringBuilder ret = new StringBuilder();
        boolean mode = false; // 0 : false, 1 : true
        char[] codeCharacter = code.toCharArray();

        for (int i = 0; i < codeCharacter.length; i++) {
            if (codeCharacter[i] == '1') {
                mode = !mode;
                continue;
            }
            if (!mode && (i % 2 == 0)) {
                 ret.append(codeCharacter[i]);
            }
            if (mode && (i % 2 != 0)) {
                ret.append(codeCharacter[i]);
            }
        }

        return ret.toString().length() == 0 ? "EMPTY" : ret.toString();
    }
}
