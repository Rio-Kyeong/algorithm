import java.util.Arrays;

class Solution {
    public int solution(int[] departmentGrant, int budget) {
        Arrays.sort(departmentGrant);

        int departmentCount = 0;
        for (int i = 0; i < departmentGrant.length && budget >= departmentGrant[i]; i++) {
            budget -= departmentGrant[i];
            departmentCount++;
        }

        return departmentCount;
    }
}
