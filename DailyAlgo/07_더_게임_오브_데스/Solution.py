def solution(target, k):
    answer = 0
    current = 1  

    for _ in range(k):
        current = target[current - 1]  
    answer = current

    return answer