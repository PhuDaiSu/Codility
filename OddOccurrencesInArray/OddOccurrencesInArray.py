def solution(A):
    found = set()
    for a in A:
        if a in found:
            found.remove(a)
        else:
            found.add(a)
    return found.pop()

# https://app.codility.com/demo/results/trainingXY4E29-3CC/
