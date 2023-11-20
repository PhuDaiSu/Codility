def solution(A):
    size = len(A)
    result = 0
    for i in range(size):
        a = A[i]
        if i + a >= size - 1:
            result += size - 1 - i
        else:
            result += a
            fromJ = i + a + 1
            for j in range(fromJ, size):
                if A[j] > j - fromJ:
                    result += 1
        if result > 10_000_000:
            return -1
    return result