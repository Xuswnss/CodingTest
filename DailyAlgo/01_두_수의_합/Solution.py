def solution(numbers, m):
    answer = 0
    pre = []
    for i in range(len(numbers)):
        # print('num1 : ', numbers[i])
        for j in range( i+ 1, len(numbers)):
            # print('num2 : ', numbers[j])
            print('두수의 합 :', numbers[i] + numbers[j])
            sum = numbers[i] + numbers[j]
            pre.append(sum)
    print('pre :', pre)
    answer = pre[0]
    for i in pre:
        # 새롭게 구한 절댓값이 이전에 절댓값보다 작을 경우 answer은 변경된다.
        if abs(i-m) < abs(answer - m):
            answer = i
    print('anser : ', answer)
            
        
    return answer
