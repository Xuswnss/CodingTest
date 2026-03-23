
def Solution(n):
    answer = 0
    for start in range(1, n//2 + 1):
        total = 0
        for num in range(start , n+1):
            total = total + num
            if total == n:
                answer += 1
                break
            elif total > n:
                break
    return answer

print(Solution(15))

#나중에 누적합 말고 투포인터로 다시 풀기
# 시간복잡도 O(n^2) 공간복잡도 O(1)