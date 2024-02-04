

class Solution {
     public static String[] solution(String[] names) {
        int groupSize = 5;
        int index = 0;
        String[] answer = new String[(names.length + groupSize - 1) / groupSize];

        for (int i = 0; i < names.length; i += groupSize) {
            answer[index++] = names[i];
        }

        return answer;
    }
}
