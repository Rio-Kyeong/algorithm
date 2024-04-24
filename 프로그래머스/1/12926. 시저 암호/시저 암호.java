class Solution {
    public String solution(String string, int number) {
        StringBuilder result = new StringBuilder();
        char[] alphabetArray = createAlphabetArray();

        for (char inputCharacter : string.toCharArray()) {
            if (inputCharacter == ' ') {
                result.append(' ');
                continue;
            }

            if (Character.isLetter(inputCharacter)) {
                char findCharacter = alphabetArray[(Character.toLowerCase(inputCharacter) - 'a' + number) % 26];

                if (Character.isUpperCase(inputCharacter)) {
                    result.append(Character.toUpperCase(findCharacter));
                } else {
                    result.append(findCharacter);
                }
            }
        }

        return result.toString();
    }

    private char[] createAlphabetArray() {
        char[] alphabetArray = new char[26];

        for (int i = 0; i < 26; i++) {
            alphabetArray[i] = (char) ('a' + i);
        }

        return alphabetArray;
    }
}
    