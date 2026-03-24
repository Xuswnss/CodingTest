def solution(t, p):
    answer = 0
    p_길이=len(p)
    t_길이=len(t)
    배열 = []
    for start in range(t_길이):
        end = start + p_길이
        잘라진_숫자 = t[start:end]
        if len(잘라진_숫자) < p_길이:
            break 
        else:
            배열.append(잘라진_숫자)
    
    for i in range(len(배열)):
        if 배열[i] <= p:
            answer +=1
            
    return answer