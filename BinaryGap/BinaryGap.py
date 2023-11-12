def solution(N):
    return max(map(len, format(N, 'b').strip('0').split('1')))

# https://app.codility.com/demo/results/trainingZ68X7U-A4X/
