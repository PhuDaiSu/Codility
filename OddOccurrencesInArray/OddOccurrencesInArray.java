import java.util.*;

class Solution {
    public int solution(int[] A) {
        Set<Integer> found = new HashSet<Integer>();
        for (Integer a : A) {
            if (found.contains(a)) {
                found.remove(a);
            } else {
                found.add(a);
            }
        }
        return found.stream().findFirst().orElseGet(null);
    }
}