def solution(s):
    answer = True
    p,y = 0,0
    for i in s:
        if i == 'p' or i == 'P':
            p += 1
        if i == 'y' or i == 'Y':
            y += 1        
    if p != y:
        return False
            
    return True

def solution2(s):
    answer = True
    s = s.lower()
    return s.count('p') == s.count('y')