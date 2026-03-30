def solution(s):
    answer = []
    for word in s:
        if answer and answer[-1] == word:
            answer.pop() #마지막 값이 현재 값과 같다면 둘이 중복되므로, 제거한다..
        else:
            answer.append(word) #아니라면 제거할 수 없으므로 append()한다.
        
    if answer :
        return  0
    else:
        return  1