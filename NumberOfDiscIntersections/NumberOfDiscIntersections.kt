fun solution(A: IntArray): Int {
    val size = A.size
    var result = 0
    for (i in 0 until size) {
        val a = A[i]
        if (a < 0) {
            continue
        }
        if (i + a >= size - 1) {
            result += size - 1 - i
        } else {
            result += a
            val fromJ = i + a + 1
            for (j in fromJ until size) {
                if (A[j] > j - fromJ) {
                    result++
                }
            }
        }
        if (result > 10_000_000) {
            return -1
        }
    }
    return result
}