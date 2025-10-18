def solution(n, m):
    answer = 0
    for i in range(n,m+1):
        i = i ** 0.5
        if i.is_integer():
            answer = answer + 1
    return answer
