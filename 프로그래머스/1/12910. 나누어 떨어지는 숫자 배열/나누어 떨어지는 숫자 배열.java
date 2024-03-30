import java.util.*;
import java.util.stream.Collectors;

class Solution {
    public List<Integer> solution(int[] array, int divisor) {
        List<Integer> result = Arrays.stream(array)
                .filter(element -> element % divisor == 0)
                .sorted()
                .boxed()
                .collect(Collectors.toList());

        return result.isEmpty() ? List.of(-1) : result;
    }
}
