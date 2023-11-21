class Solution {
    public int solution(int[] A) {
        int size = A.length;
        int result = 0;
        for (int i = 0; i < size; i++) {
            int a = A[i];
            if (i + a >= size - 1) {
                result += size - 1 - i;
            } else {
                result += a;
                int fromJ = i + a + 1;
                for (int j = fromJ; j < size; j++) {
                    if (A[j] > j - fromJ) {
                        result++;
                    }
                }
            }
            if (result > 10_000_000) {
                return -1;
            }
        }
        return result;
    }
}