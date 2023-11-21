function solution(A) {
    const size = A.length;
    let result = 0;

    for (let i = 0; i < size; i++) {
        const a = A[i];

        if (i + a >= size - 1) {
            result += size - 1 - i;
        } else {
            result += a;
            const fromJ = i + a + 1;

            for (let j = fromJ; j < size; j++) {
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