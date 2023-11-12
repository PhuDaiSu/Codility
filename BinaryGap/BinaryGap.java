import java.util.*;

class Solution {
    public int solution(int N) {
        char[] binaryN = Integer.toBinaryString(N).toCharArray();
        int maxGap = 0, gap = 0;
        for (char c : binaryN) {
            if (c == '1') {
                if (gap > maxGap) {
                    maxGap = gap;
                }
                gap = 0;
            } else {
                gap++;
            }
        }
        return maxGap;
    }
}