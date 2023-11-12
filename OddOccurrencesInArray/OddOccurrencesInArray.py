def solution(A):
    found = set()
    for a in A:
        if a in found:
            found.remove(a)
        else:
            found.add(a)
    return found.pop()