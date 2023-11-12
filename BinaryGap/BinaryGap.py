def solution(N):
    return max(map(len, format(N, 'b').strip('0').split('1')))