int solution(int A[], int size) {
    int result = 0;
    for (int i = 0; i < size; i++) {
        int a = A[i];
        if (i + (long) a >= size - 1) {
            result += size - 1 - i;
        } else {
            result += a;
            int fromJ = i + a + 1;
            for (int j = fromJ; j < size; j++) {
                if (A[j] > j - fromJ) {
                    result += 1;
                }
            }
        }
        if (result > 10000000) {
            return -1;
        }
    }
    return result;
}