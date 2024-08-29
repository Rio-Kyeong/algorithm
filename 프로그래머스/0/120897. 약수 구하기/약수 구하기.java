import java.util.*;
import java.util.stream.Collectors;

class Solution {
    public Set<Integer> solution(int n) {
        Set<Integer> divisors = new HashSet<>();

        for (int i = 1; i <= Math.sqrt(n); i++) {
            if (n % i == 0) {
                divisors.add(i);
                divisors.add(n / i);
            }
        }

        return divisors.stream()
                .sorted()
                .collect(Collectors.toCollection(LinkedHashSet::new));
    }
}
