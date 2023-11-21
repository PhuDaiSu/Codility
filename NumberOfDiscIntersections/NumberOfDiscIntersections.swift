import Foundation
import Glibc

public func solution(_ A : inout [Int]) -> Int {
    let size = A.count
    var result = 0

    for i in 0..<size {
        let a = A[i]

        if i + a >= size - 1 {
            result += size - 1 - i
        } else {
            result += a
            let fromJ = i + a + 1

            for j in fromJ..<size {
                if A[j] > j - fromJ {
                    result += 1
                }
            }
        }

        if result > 10_000_000 {
            return -1
        }
    }

    return result
}