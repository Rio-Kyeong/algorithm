class Solution {
    public String solution(String[] seoul) {
        if (seoul == null) {
            throw new IllegalArgumentException("seoul 배열이 null입니다.");
        }
        if (seoul.length < 1 || seoul.length > 1000) {
            throw new IllegalArgumentException("seoul 길이는 1 이상 1,000 이하입니다.");
        }

        int index = -1;
        for (int i = 0; i < seoul.length; i++) {
            if (seoul[i].equals("Kim")) {
                index = i;
                break;
            }
        }

        if (index == -1) {
            throw new IllegalArgumentException("seoul 배열에 'Kim'이 없습니다.");
        }

        return "김서방은 " + index + "에 있다";
    }
}
