object Solution {
  def solution(A: Array[Int]): Int = {
    val size = A.length
    var result = 0

    for (i <- 0 until size) {
      val a = A(i)
      if (i + a.toLong >= size - 1) {
        result += size - 1 - i
      } else {
        result += a
        val fromJ = i + a + 1
        for (j <- fromJ until size) {
          if (A(j) > j - fromJ) {
            result += 1
          }
        }
      }
      if (result > 10000000) {
        return -1
      }
    }
    result
  }
}